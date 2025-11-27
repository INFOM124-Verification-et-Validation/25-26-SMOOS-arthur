package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        // parcourir la liste et résoudre les cas particuliers (Brie, backstage, et Sulfuras) par un appel à d'autres méthodes

        for (int i = 0; i < items.length; i++) {
            if (items[i].category.equals("standard")) {
                // appel méthode standard
                updateStandard(items[i]);
            }
            else if (items[i].category.equals("conjured")) {
                //appel méthode conjured (dépéris en qual 2x plus vite)
                updateConjured(items[i]);
            }
            else {
                updateSpecial(items[i]);
                //appel méthode spécial (qui auront des sous méthodes pour chaque produit spécial
            }

            }
        }


    private void updateStandard(Item item) {
        if (item.quality > 0){
        item.quality = item.quality -1;

        }
        item.sellIn = item.sellIn - 1;
    }

    private void updateConjured(Item item) {
        if (item.quality > 1){
            item.quality = item.quality -2;
        }
        else { item.quality = 0;}
        item.sellIn = item.sellIn - 1;
    }

    private void updateSpecial(Item item) {
        if (item.quality > 0){
            if (item.name.equals("Aged Brie")){
                if (item.quality < 50){item.quality = item.quality + 1;}

            }
            else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
                if (item.quality < 50 && item.sellIn > 1){
                    if (item.sellIn < 6){ item.quality = item.quality +3;}
                    else if (item.sellIn < 11){ item.quality = item.quality +2;}
                    else { item.quality = item.quality +1;}

                }
                else { item.quality = 0;}

            }


        }
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")){
            item.sellIn = item.sellIn - 1;
        }

    }


}



