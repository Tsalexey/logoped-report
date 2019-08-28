package ru.atsarev.logopedquizz.stubs;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import ru.atsarev.logopedquizz.dto.*;

import java.util.*;

@Service
@NoArgsConstructor
public class ReportStub {

    public void fillStubForNdvpfd(Report report) {
        report.setTitle("Нейропсихологическая диагностика высших психических функций детей с 3-х до 18 лет");

        /* Page 1 */
        Section s1 = new Section();
        s1.setTitle("Анкета");

        Question q11 = createTextQuestion("Ф.И.О.");
        Question q12 = createTextQuestion("Возраст");
        Question q13 = createTextQuestion("Дата обследования");

        Subsection ss1 = createSubsection(
                "Личные данные",
                Arrays.asList(q11, q12, q13)
        );

        s1.setSubsections(Arrays.asList(ss1));

        /* Page 2 */
        Section s2 = new Section();
        s2.setTitle("Методики");

        //
        Question q21 = createCheckboxQuestion(
                "Установление контакта. Сфера общих знаний. Эмоциональное состояние. Характеристика психического функционирования. Поведение. Даётся с 3-х лет.",
                Arrays.asList(
                        "Расторможенность, общее возбуждение, ролевое поведение",
                        "Расторможенность, общее возбуждение, ролевое поведение",
                        "Негативизм (отказ от задания)",
                        "Агрессия или аутоагрессия",
                        "Отвлекаемость, нарушение избирательности",
                        "Низкая сфера общих знаний",
                        "Трудности называния времени года",
                        "Трудности называния месяца",
                        "Трудности называния чиса, дня недели, года",
                        "Трудности называния  своего имени, возраста, имени мамы",
                        "Трудности называния своего имени и фамилии",
                        "Трудности называния своего адреса (улицы и города)",
                        "Неадекватность",
                        "Нарушение чувства дистанции",
                        "Напряжённость, тревожность",
                        "Некритичность",
                        "Повышенная зависимость от ролителей, постоянное обращение к ним за помощью"));

        Subsection ss21 = createSubsection(
                "Общая характеристика",
                Arrays.asList(q21)
        );

        //
        Question q221 = createCheckboxQuestion(
                "Корректурная проба \"Личики\". Дается с 4-х лет.",
                Arrays.asList("Трудности концентрации внимания",
                        "Низкая умственная работоспособность",
                        "Долгое вхождение в задание",
                        "Снижение (истощаемость) работоспособности",
                        "Флуктуации нейродинамики",
                        "Трудности усвоения программы",
                        "Трудности удержания программы",
                        "Нарушение избирательности",
                        "Хаотичная стратегия выполнения"));

        Question q222 = createCheckboxQuestion(
                "Таблицы Шульте. Даётся с 8-ми лет",
                Arrays.asList(
                        "Трудности концентрации внимания",
                        "Низкая умственная работоспособность",
                        "Долгое вхождение в задание",
                        "Снижение умственной работоспособности",
                        "Трудности усвоения программы",
                        "Трудности удержания программы",
                        "Флуктуации нейроинамики",
                        "Замена похожих чисел (12-21)"));

        Subsection ss22 = createSubsection(
                "Исследование умственной работоспособности",
                Arrays.asList(q221, q222)
        );

        Question q231 = createCheckboxQuestion(
                "Реципрокная координация движений. Даётся с 4-х лет, выполнение без ошибок к 8-ми годам",
                Arrays.asList(
                        "Адинамия",
                        "Алиированное выполнение",
                        "Синкинезии",
                        "Поочерёдное выполнение",
                        "Игнорирование левой/правой руки",
                        "Разведение рук в пространстве",
                        "Импульсивность",
                        "Замедленность",
                        "Сбои и отставания в правой/левой/обеих руках"
                ));

        Question q232 = createCheckboxQuestion(
                "Реакция выбора.\n1) " +
                        "\"Поочередное поднимание рук на количество разных стуков\". Даётся с 6-ти лет.\n" +
                        "2) \"Палец-кулак\". Даётся с 5-ти лет.",
                Arrays.asList(
                        "Адинамия",
                        "Утеря программы",
                        "Трудности усовения двигательной программы",
                        "Импульсивность",
                        "Эхопраксия",
                        "Стереотипии",
                        "Трудности речевой регуляции движений и действий"
                ));

        Question q233 = createCheckboxQuestion(
                "Динамический праксис:\n" +
                        "1) \"Кулак-ребро\" далее \"К-Р\". Даётся с 3-х лет\n" +
                        "2) \"Кулак-ребро\"/\"Ладонь-кулак\" далее \"К-Р\"/\"Л-К\". Даётся с 4-х лет\n" +
                        "3) \"Ладонь-ребро-кулак\"/\"Кулак-ладонь-ребро\" далее \"Л-К-Р\"/\"К-Л-Р\". Даётся детям с 5-ти лет и старше",
                Arrays.asList(
                        "Упрощение двигательной программы",
                        "Увеличение числа элементов (движений)",
                        "Нарушение порядка серии движений",
                        "Стереотипии (кулак стоя)",
                        "Пространсвенные векторные ошибки",
                        "Пространственные структурно-топологические ошибки",
                        "Инертность",
                        "Трудности речевой регуляции движений и действий",
                        "Поэлементное выполнение (дезавтоматизация)",
                        "Вялая рука, неполное сжатие кулака",
                        "Напряжённая кисть",
                        "Большая амплитуда движений",
                        "Сильные удары по столу",
                        "Неловкие движения с участием всего корпуса"
                ));

        Question q234 = createCheckboxQuestion(
                "Графическая проба. Даётся с 5-ти лет",
                Arrays.asList(
                        "Уподобления",
                        "Макрография",
                        "Микрография",
                        "Элементарные персеверации",
                        "Дизметрия",
                        "Стереотипии (п-л)",
                        "Смещение строки вниз/вверх"
                ));

        Question q235 = createCheckboxQuestion(
                "Оральный праксис. Даётся с 4-х лет",
                Arrays.asList(
                        "Гипертонус (языка, губ, щёк)",
                        "Вялость воспроизведения поз",
                        "Трудности и неточности воспроизведения поз",
                        "Асимметричное выполнение",
                        "Гиперсаливация",
                        "Синкинезии",
                        "Промахивания",
                        "Замедленность и поиск позы",
                        "Тремор"
                ));

        Question q236 = createCheckboxQuestion(
                "Праксис позы пальцев. Даётся с 3-х лет",
                Arrays.asList(
                        "Трудности воспроизведения (замены, поиск) позы пальцев в обеих руках, которые компенсируются при зрительном контроле",
                        "Трудности воспроизведения (замены, поиск) позы пальцев в обеих руках, которые не компенсируются при зрительном контакте",
                        "Пространственные координатные (векторные) ошибки в правой/левой/обеих руках",
                        "Пространственные сомато-топические ошики в правой/левой/обеих руках",
                        "Пространственные структурно-топологические ошибки в правой/левой/обеих руках",
                        "Синкинезии",
                        "Выполнение с помощью другое руки",
                        "Неточное положение фоновых пальцев",
                        "Зеркальные ошибки при отсутсвии других протсранственных мануальных трудностей"
                ));

        Question q237 = createCheckboxQuestion(
                "Проба Хэда. Даётся с 9-ти лет",
                Arrays.asList(
                        "Пространственные координатные (векторные/зеркальные) ошибки",
                        "Пространственные  структурно-топологические ошибки",
                        "Пространственные сомато-топические ошибки",
                        "Зеркальные ошибки при отсутствии других пространственных трудностей"
                ));

        Question q238 = createCheckboxQuestion(
                "Воспроизведение ритмов по речевой инструкции. Даётся с 5-ти лет",
                Arrays.asList(
                        "Трудности выполнения акцентированных ритмов по инструкции разных по силе ударов",
                        "Замена порядка разных по силе удара ритмов по инструкции",
                        "Трудности усвоения инструкции",
                        "Трудности речевой регуляции движений",
                        "Трудности понимания логико-грамматических конструкций",
                        "Лишние импульсы при воспроизведении ритмов"
                ));

        Subsection ss23 = createSubsection(
                "Исследование движений и действий",
                Arrays.asList(q231, q232, q233, q234, q235, q236, q237, q238)
        );

        //
        Question q241 = createCheckboxQuestion(
                "Пробы на предметный гнозис.\n" +
                        "1) \"Реалистичные изображения\". Даётся с 3-х лет.\n" +
                        "2) \"Перечёркнутые изображения\". Даётся с 4-х лет.\n" +
                        "3) \"Наложенные изображения\". Даётся с 4-х лет.\n" +
                        "4) \"Недорисованные изображения\". Даётся с 5-ти лет.",
                Arrays.asList(
                        "Трудности узнавания реалистичных изображений",
                        "Фрагментарность восприятия перечёркнутых и наложенных изображений",
                        "Фрагментарность восприятия недорисованных изображений",
                        "Игнорирование зрительного пространства",
                        "Псевдоагнозии",
                        "Трудности симультанного синтеза",
                        "Трудности называния предметов",
                        "Аномии",
                        "Контаминации/персеверациии/антиципации"
                )
        );

        Question q242 = createCheckboxQuestion(
                "Проба на слуховой гнозис. Даётся с 4-х лет.\n" +
                        "1) \"Образец\". Даётся с 6-ти лет.\n" +
                        "2) \"Инструкция\". Даётся с 5-ти лет.\n" +
                        "3) \"Оценка\". Даётся с 4-х лет.",
                Arrays.asList(
                        "Трудности восприятия ритмической структуры",
                        "Сужение объема слухового восприятия при сохранной ритмической структуре",
                        "Замена воспроизведения ритмов по инструкции недифференциированным рядом ударов",
                        "Недооценка ритмов",
                        "Переоценка ритмов",
                        "Персеверации предыдущей структуры"
                )
        );

        Question q243 = createCheckboxQuestion(
                "Проба на тактильный гнозис. Даётся с 3-х лет.",
                Arrays.asList(
                        "Сомато-топические ошибки промахивания более 1 см. в левой руке",
                        "Сомато-топические ошибки промахивания более 1 см. в правой руке",
                        "Игнорирование прикосновения на левой руке в двуручных пробах",
                        "Игнорирование прикосновения на правой руке в двуручных пробах"
                )
        );

        Question q244 = createCheckboxQuestion(
                "Проба на стереогноз \"Волшебный мешочек\". Даётся с 7-ми лет.",
                Arrays.asList(
                        "Трудности восприятия отдельных свойств предметов с закрытыми глазами в левой/правой руке"
                )
        );

        Question q245 = createCheckboxQuestion(
                "Проба на пространственный гнозис.\n" +
                        "1) Копирование круга и квадрата. Даётся детям с 3-х лет.\n" +
                        "2) Копирование круга, треугольника и квадрата; тест Бентона. Даются детям с 4-х лет.\n" +
                        "3) Копирование круга, треугольника, квадрата и ромба; фигуры Денманна. Даются детям с 5-ти лет.\n" +
                        "4) Копирование фигур Тейлора и Рея-Остерица. Даются детям с 7-ми лет.\n" +
                        "5) Копирование \"Домик с забором\". Даётся детям с 9-ти лет.",
                Arrays.asList(
                        "Игнорирование (чаще левого) зрительного протстранства",
                        "Пространственные координатные (векторные) ошибки при копировании геометрических фигур",
                        "Пространственные метрические ошибки при копировании геометрических фигур",
                        "Пространственные структурно-топологические ошибки при копировании геометрических фигур",
                        "Пространственные проекционные ошибки при копировании изображения",
                        "Персеверации",
                        "Дизметрии"
                )
        );

        Question q246 = createCheckboxQuestion(
                "\"Слепые часы\". Даётся с 9-ти лет.",
                Arrays.asList(
                        "Пространственные структурно-топологические ошибки (например, вместо 5 минут - 20 минут)",
                        "Пространственные координатные ошибки (например, разворот стрелки равно на 180*)",
                        "Пространственные метрические ошибки (например, вместо 5 минут - 7 минут)"
                )
        );

        Question q247 = createCheckboxQuestion(
                "Копирование с поворотом на 180* \"Перевертыши\". Даётся с 9-ти лет.",
                Arrays.asList(
                        "Трудности удержания программы",
                        "Пространственные координатные ошибки при копировании геометрических фигур",
                        "Пространственные метрические ошибки при копировании изображения",
                        "Пространственные структурно-топологические ошибки при копировании геометрических фигур"
                )
        );

        Subsection ss24 = createSubsection(
                "Исследование гностической сферы",
                Arrays.asList(q241, q242, q243, q244, q245, q246, q247)
        );

        //

        Question q251 = createCheckboxQuestion(
                "Оценка экспрессивной речи",
                Arrays.asList(
                        "Искажение просодики речи",
                        "Смазанность, дизартричная речь",
                        "Трудности артикуляции",
                        "Логорея",
                        "Аспонтанность в речи",
                        "Контаминации/антиципации/персеверации",
                        "Эхолапии",
                        "Эмболы",
                        "Скандированность речи",
                        "Неразвёрнутость, бедность речи",
                        "Аграмматизмы в речи",
                        "Вербальные парафразии",
                        "Литеральные парафразии"
                )
        );

        Question q252 = createCheckboxQuestion(
                "Исследование рядовой речи. Даётся с 8-ми лет.",
                Arrays.asList(
                        "Несформированност рядовой речи",
                        "Нарушение порядка перечисляемых стимулов",
                        "Аспонтанность в речи",
                        "Эхолапии",
                        "Трудности в артикуляции",
                        "Искажение просодики речи",
                        "Смазанность, дизартричная речь",
                        "Скандированность речи",
                        "Контаминации",
                        "Эмболы"
                )
        );

        Question q253 = createCheckboxQuestion(
                "Называние низкочастотных слов. Даётся с 4-х лет",
                Arrays.asList(
                        "Трудности артикуляции",
                        "Искажение просодики речи",
                        "Смазанность, дизартричная речь",
                        "Скандированность речи",
                        "Контаминации",
                        "Эмболы",
                        "Трудности называния низкочастотных слов, бедность речи",
                        "Аномии",
                        "Парафразии",
                        "Поиск номинаций"
                )
        );

        Question q254 = createCheckboxQuestion(
                "Понимание логико-грамматических конструкций. Даётся с 4-х лет.",
                Arrays.asList(
                        "Отчуждение смысла слов",
                        "Трудности понимания прямых активных обратимых логико-грамматических конструкций",
                        "Трудности понимания пассивных обратимых логико-грамматических конструкций",
                        "Трудности усвоения инструкции",
                        "Трудности удержания инструкции"
                )
        );

        Question q255 = createCheckboxQuestion(
                "Понимание предложных конструкций. Даётся с 4-х лет.",
                Arrays.asList(
                        "Отчуждение смысла слов",
                        "Трудности понимания предложных конструкций (\"в\", \"на\")",
                        "Трудности понимания предложных конструкций (\"за\")",
                        "Трудности понимания предложных конструкций (\"перед\")",
                        "Трудности усвоения инструкции",
                        "Трудности удержания инструкции"
                )
        );

        Question q256 = createCheckboxQuestion(
                "Проба на акустико-артикуляционный образ звука\n" +
                        "В 3 года \"а-у\"\n" +
                        "В 4 года \"ы-о, е-и, а-и\"\n" +
                        "В 5 лет \"у-ю, и-о\"\n" +
                        "В 6 лет \"г-к\"",
                Arrays.asList(
                        "Отчуждение смысла слов",
                        "Трудности узнавания фонем далёких по звучанию",
                        "Трудности узнавания фонем близких по звучанию",
                        "Замены фонем близких по звучанию",
                        "Замены фонем далёких по звучанию",
                        "Изменение порядка слов",
                        "Трудности усвоения инструкции",
                        "Трудности удержания инструкции",
                        "Замены согласных звуков (оппозиционных фонем)",
                        "Замены гласных звуков первого ряда",
                        "Замены гласных звуков второго ряда",
                        "Сужение акустического объема восприятия слов"
                )
        );

        Question q257 = createCheckboxQuestion(
                "Исследование фонематического слуха. Даётся с 6 лет.",
                Arrays.asList(
                        "Отчуждение смысла слов",
                        "Трудности узнавания фонем близких по звучанию",
                        "Замены фонем близких по звучанию (оппозиционных фонем)",
                        "Изменение порядка слов",
                        "Трудности усвоения инструкции",
                        "Трудности удержания инструкции",
                        "Сужение акустического объема восприятия слов"
                )
        );

        Question q258 = createCheckboxQuestion(
                "Пересказ текста по вопросам. Даётся с 5-ти до 7-ми лет.",
                Arrays.asList(
                        "Дефекты экспрессивной речи",
                        "Соскальзывание на побочные ассоциации",
                        "Отчуждение смысла слов",
                        "Трудности различения речевых интонаций",
                        "Сужение акустического объема восприятия фраз"
                )
        );

        Question q259 = createCheckboxQuestion(
                "Исследование письма. Даётся с 8-ми лет.",
                Arrays.asList(
                        "Побуквенное письмо",
                        "Перестановки букв, слогов",
                        "Замены близких по артикуляции (реже далёких) букв",
                        "Несогласование окончаний, предлогов",
                        "Трудности соблюдения/удержания правил орфографии",
                        "Недописывание слов",
                        "Замены фонем близких по звучанию",
                        "Вербальные параграфии",
                        "Литеральные пространственные параграфии",
                        "Литеральные оптические параграфии",
                        "Небрежный почерк",
                        "Дизметрия почерка, макро/микрографии",
                        "Слитное написание слов, фраз"
                )
        );

        Question q2510 = createCheckboxQuestion(
                "Исследование чтения. Даётся с 8-ми лет.",
                Arrays.asList(
                        "Монотонность в чтении",
                        "Потеря строки",
                        "Послоговое чтение",
                        "Перестановка букв, слогов",
                        "Замены близких по артикуляции (реже далёких) букв",
                        "Угадывающее чтение (искажение окончаний)",
                        "Непонимание смысла прочитанного текста",
                        "Трудности различения речевых интонаций"
                )
        );

        Subsection ss25 = createSubsection(
                "Исследование речевой сферы",
                Arrays.asList(q251, q252, q253, q254, q255, q256, q257, q258, q259, q2510)
        );

        //
        Question q261 = createCheckboxQuestion(
                "Проба на слухоречевую память \"Заучивание слов\". Даётся с 3-х лет.",
                Arrays.asList(
                        "Низкая продуктивность воспоминания",
                        "Сужение объёма непосредственного воспроизведения, отсутсвует \"фактор края\"",
                        "Сужение объёма отсроченного воспроизведения из-за тормозимости следов интерференций",
                        "Снижение объёма запоминания",
                        "Конфабуляции",
                        "Реминисценции",
                        "Инактивность мнестической деятельности",
                        "Флуктуации мнестической деятельности",
                        "Сужение объёма при непосредственном воспроизведении, отчетливый \"фактор края\"",
                        "Литеральные парафразии",
                        "Вербальные парафразии",
                        "Долгое вхождение в задание (2-3 слова после первого предъявления)"
                )
        );

        Question q262 = createCheckboxQuestion(
                "Проба на двигательную память. Даётся с 4-х лет.",
                Arrays.asList(
                        "Снижение объёма запоминания",
                        "Инертное воспроизведение предшествующих движений при запоминании последующих",
                        "Сужение объёма при непосредственном воспроизведении, отчётливый \"фактор края\"",
                        "Снижение продуктивности запоминания двигательных стимулов",
                        "Долгое вхождение в задание"
                )
        );

        Question q263 = createCheckboxQuestion(
                "Проба на зрительную память. Даётся с 3-х лет.",
                Arrays.asList(
                        "Сужение объёма запоминания непосредственного воспроизведение, отсутсвует \"фактор края\"",
                        "Инертное воспроизведение предшествующих стимулов при запоминании предыдущих",
                        "Трудности воспроизведения порядка зрительных стимулов",
                        "Сужение объёма при непосредственном воспроизведении, отчётливый \"фактор края\"",
                        "Снижение продуктивности запоминания зрительных стимулов",
                        "Перцептивные замены в зрительной памяти"
                )
        );

        Question q264 = createCheckboxQuestion(
                "\"Невербализуемые фигуры\". Даётся с 7 лет",
                Arrays.asList(
                        "Игнорирование (чаще левого) зрительного пространства",
                        "Трудности воспроизведения порядка зрительных стимулов",
                        "Пространственные координатные (векторные) ошибки при копировании геометрических фигур",
                        "Пространственные метрические ошибки при копировании геометрических фигур",
                        "Пространственные структурно-топологические ошибки при копировании геометрических фигур",
                        "Дизметрия",
                        "Трансформация в закомые знаки (цифры, буквы)",
                        "Снижение продуктивности запоминания зрительных стимулов"
                )
        );

        Question q265 = createCheckboxQuestion(
                "Запоминания логически-связной информации. Даётся с 7-ми лет.",
                Arrays.asList(
                        "Сужение объёма",
                        "Фрагментарность воспроизведения пересказа",
                        "Конфабуляции",
                        "Пропуски смысловых элементов текста",
                        "Звуковые замены",
                        "Будные словарные запас"
                )
        );

        Subsection ss26 = createSubsection(
                "Исследование мнестической сферы",
                Arrays.asList(q261, q262, q263, q264, q265)
        );

        //
        Question q271 = createCheckboxQuestion(
                "Понимание смысла рассказов. Даётся с 5-ти лет",
                Arrays.asList(
                        "Постепенныя врабатываемость в деятельность",
                        "Спонтанность в речи",
                        "Инертность",
                        "Импульсивность при анализе рассказа",
                        "Фрагментарность анализа",
                        "Трудности выведения морали",
                        "Соскальзывание на побочные ассоциации",
                        "Неспособность к самостоятельному описанию сюжета",
                        "Непонимание переносного смысла"
                )
        );

        Question q272 = createCheckboxQuestion(
                "Понимание сюжетной - серии сюжетных картин. Даётся с 4-х лет.",
                Arrays.asList(
                        "Постепенная врабатываемость в деятельность",
                        "Трудности понимания на фоне сильного утомления",
                        "Аспонтанность",
                        "Инертность",
                        "Импульсивность при анализе",
                        "Непонимание смысла сюжетных картин",
                        "Фрагментарность анализа",
                        "Непонимание серии сюжетных картин",
                        "Соскальзывание на побочные ассоциации при описании сюжета",
                        "Неспособность к самостоятельному описанию сюжета"
                )
        );

        Question q273 = createCheckboxQuestion(
                "\"Аналогии\" (картиночные). Даётся с 5-ти лет.\n" +
                        "\"Аналогии\" (вербальные). Даётся с 9 лет.",
                Arrays.asList(
                        "Постепенная врабатываемость в деятельность",
                        "Трудности понимания пробы на фоне сильного утомления",
                        "Аспонтанность",
                        "Инертность",
                        "Импульсивность",
                        "Трудности усвоения инструкции",
                        "Трудности удержания инструкции",
                        "Выделение аналогий по ситуативному признаку",
                        "Несформированность процесса выведения логических связей"
                )
        );

        Question q274 = createCheckboxQuestion(
                "\"4-й лишний\" (картиночный). Даётся с 3-х лет.\n" +
                        "\"5-1 лишний\" (вербальный). Даётся с 9 лет.",
                Arrays.asList(
                        "Постепенная врабатываемость в деятельность",
                        "Трудности понимания на фоне сильного утомления",
                        "Аспонтанность",
                        "Трудности усвоения инструкции",
                        "Трудности удержания инструкции",
                        "Инертность",
                        "Импульсивность",
                        "Трудности обобщения",
                        "Обобщение по ситуативному признаку",
                        "Несформироанность процесса общения"
                )
        );

        Question q275 = createCheckboxQuestion(
                "\"Порядковый счёт\" . Даётся с 3-х до 7-ми лет.\n" +
                        "\"Счёт по Крепелину\". Даётся с 8 лет.",
                Arrays.asList(
                        "Постепенная врабатываемость в деятельность",
                        "Трудности усвоения инструкции",
                        "Трудности удержания инструкции",
                        "Аспонтанность",
                        "Инертность",
                        "Импульсивность",
                        "Неавтоматизированность разрядного числа",
                        "Замедленность счета (по Крепелину)",
                        "Неусвоение программы счёта по Крепелину",
                        "Персеверации при счёте по Крепелину",
                        "Трудности порядкового счёта в пределах 10",
                        "Трудности счёта при переходе через десяток",
                        "Флуктуации в счёте по Крепелину",
                        "Забывание промежуточного результата"
                )
        );

        Question q276 = createCheckboxQuestion(
                "\"Задачи\". Даются с 7 лет.",
                Arrays.asList(
                        "Трудности понимания задач на фоне сильного утомления",
                        "Импульсивность при решении",
                        "Непонимание условий задачи",
                        "Невозможность составления плана решения задач",
                        "Трудности следования плану",
                        "Трудности переключения при смене алгоритма"
                )
        );

        Subsection ss27 = createSubsection(
                "Исследование мышления",
                Arrays.asList(q271, q272, q273, q274, q275, q276)
        );


        s2.setSubsections(
                Arrays.asList(ss21, ss22, ss23, ss24, ss25, ss26, ss27)
        );

        report.setSections(Arrays.asList(s1, s2));

    }

    private Subsection createSubsection(String title, List<Question> questions) {
        Subsection subsection = new Subsection();

        subsection.setTitle(title);
        subsection.setQuestions(questions);

        return subsection;
    }

    private Question createCheckboxQuestion(String title, List<String> options) {
        Question q = new CheckboxQuestion();

        List<TextQuestion> o = new ArrayList<>();

        for (String s : options){
            TextQuestion tq = new TextQuestion();
            tq.setQuestion(s);
            o.add(tq);
        }

        ((CheckboxQuestion) q).setTitle(title);
        ((CheckboxQuestion) q).setOptions(o);

        return q;
    }

    private Question createTextQuestion(String question){
        Question q = new TextQuestion();

        ((TextQuestion) q).setQuestion(question);

        return q;
    }
}
