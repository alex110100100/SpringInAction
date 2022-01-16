package com.springinaction.knights;

public class DamselRescuingKnight implements Knight {

   private RescueDamselQuest quest;

   public DamselRescuingKnight() {
      this.quest = new RescueDamselQuest();  //tight coupling - the knight can only embark on one type of quest
   }

   public void embarkOnQuest() {
      quest.embark();
   }
}