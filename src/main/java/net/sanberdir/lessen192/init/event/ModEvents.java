package net.sanberdir.lessen192.init.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sanberdir.lessen192.Lessen192;
import net.sanberdir.lessen192.init.item.InitItemsL192;
import net.sanberdir.lessen192.init.villager.ModVillagers;
import org.jetbrains.annotations.Nullable;

import java.util.*;

@Mod.EventBusSubscriber(modid = Lessen192.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        if(event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook = new ItemStack(Items.ENCHANTED_BOOK, 1); // Создаем стопку с зачарованной книгой
            Enchantment enchantment = Enchantments.MENDING;
            Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(enchantedBook);
            enchantments.put(enchantment, 1);
            EnchantmentHelper.setEnchantments(enchantments, enchantedBook); // Применяем зачарования к книге
            int villagerLevel = 1;
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    enchantedBook, // Зачарованная книга теперь является ценой
                    new ItemStack(Items.EMERALD, 17), // Изумруды - товар
                    10, 2, 0.00F));
        }
        if(event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook = new ItemStack(Items.ENCHANTED_BOOK, 1); // Создаем стопку с зачарованной книгой
            Enchantment enchantment = Enchantments.MENDING;
            Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(enchantedBook);
            enchantments.put(enchantment, 1);
            EnchantmentHelper.setEnchantments(enchantments, enchantedBook); // Применяем зачарования к книге
            int villagerLevel = 1;
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 23),
                    enchantedBook,4,2,0.00F));
        }
        if(event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook = new ItemStack(Items.ENCHANTED_BOOK, 1); // Создаем стопку с зачарованной книгой
            Enchantment enchantment = Enchantments.SILK_TOUCH;
            Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(enchantedBook);

            enchantments.put(enchantment, 1);
            EnchantmentHelper.setEnchantments(enchantments, enchantedBook); // Применяем зачарования к книге
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 20),
                    enchantedBook,4,15,0.00F));
        }
        if(event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook = new ItemStack(Items.ENCHANTED_BOOK, 1); // Создаем стопку с зачарованной книгой
            Enchantment enchantment = Enchantments.AQUA_AFFINITY;
            Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(enchantedBook);

            enchantments.put(enchantment, 3);
            EnchantmentHelper.setEnchantments(enchantments, enchantedBook); // Применяем зачарования к книге
            int villagerLevel = 1;
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    enchantedBook, // Зачарованная книга теперь является ценой
                    new ItemStack(Items.EMERALD, 15), // Изумруды - товар
                    10, 2, 0.00F));
        }

        if(event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.POTION, 1); //Продаю 5 хлопка
            PotionUtils.setPotion(stack, Potions.LUCK); // Делаем из стека зелье силы
            int villagerLevel = 1; //Уровень жителя
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 15), // 15 Изумруда
                    stack,10,500,0.02F));
        }

        if(event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.POTION, 1); //Продаю 5 хлопка
            PotionUtils.setPotion(stack, Potions.SLOW_FALLING); // Делаем из стека зелье силы
            int villagerLevel = 1; //Уровень жителя
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12), // 2 Изумруда
                    stack,10,500,0.02F));
        }
        if(event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.POTION, 1); //Продаю 5 хлопка
            PotionUtils.setPotion(stack, Potions.POISON); // Делаем из стека зелье силы
            int villagerLevel = 1; //Уровень жителя
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 15), // 15 Изумруда
                    stack,10,500,0.02F));
        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.SUGAR, 1); //Продаю 5 хлопка
            int villagerLevel = 1; //Уровень жителя
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15), // 15 Изумруда
                    stack,
                    10,
                    500,
                    0.02F));
        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack firstStack = new ItemStack(Items.SUGAR, 1); // Продаю 1 сахар
            ItemStack secondStack = new ItemStack(Items.EMERALD, 15); // 15 Изумрудов второстепнный предмет
            ItemStack tradeStack = new ItemStack(Items.DIAMOND, 2); // 2 алмаза покупка
            int villagerLevel = 1; // Уровень жителя
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    secondStack, // Основной предмет (цена)
                    firstStack, // Второстепенный предмет (дополнительная цена)
                    tradeStack, // Продаваемый предмет
                    10, // Максимальное количество использований
                    500, // Опыт для жителя
                    0.02F)); // Модификатор цены
        }
        if(event.getType() == ModVillagers.JUMP_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(InitItemsL192.CHLOPOK.get(), 5); //Продаю 5 хлопка
            int villagerLevel = 1; //Уровень жителя
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // 2 Изумруда
                    stack,10,500,0.02F));
        }
        //        1 - Максимум торговли 2 - опыт 3 - прирост в цене
        if(event.getType() == ModVillagers.JUMP_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 5);
            int villagerLevel = 1;
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(InitItemsL192.BOX.get(), 2),
                    stack,10,8,0.02F));
        }

        if(event.getType() == ModVillagers.JUMP_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(InitItemsL192.ZIRCON.get(), 15);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    stack,10,8,0.02F));
        }
        if(event.getType() == ModVillagers.JUMP_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EXPERIENCE_BOTTLE, 64);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }
        if(event.getType() == ModVillagers.JUMP_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.DIAMOND, 64);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }
        if(event.getType() == ModVillagers.JUMP_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.IRON_INGOT, 64);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack,10,8,0.02F));
        }
    }

}