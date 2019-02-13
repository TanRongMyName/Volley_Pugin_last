package com.coffe.shentao.volly.http.bean;



public class Weather {

    /**
     * resultcode : 200
     * reason : 查询成功
     * result : {"sk":{"temp":"7","wind_direction":"东南风","wind_strength":"3级","humidity":"65%","time":"13:04"},"today":{"temperature":"7℃~9℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期二","city":"南京","date_y":"2019年01月29日","dressing_index":"较冷","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","uv_index":"最弱","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":{"day_20190129":{"temperature":"7℃~9℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期二","date":"20190129"},"day_20190130":{"temperature":"3℃~9℃","weather":"小雨转雨夹雪","weather_id":{"fa":"07","fb":"06"},"wind":"东北风微风","week":"星期三","date":"20190130"},"day_20190131":{"temperature":"-2℃~4℃","weather":"雨夹雪转多云","weather_id":{"fa":"06","fb":"01"},"wind":"北风微风","week":"星期四","date":"20190131"},"day_20190201":{"temperature":"1℃~6℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期五","date":"20190201"},"day_20190202":{"temperature":"7℃~10℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"西南风微风","week":"星期六","date":"20190202"},"day_20190203":{"temperature":"1℃~6℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期日","date":"20190203"},"day_20190204":{"temperature":"-2℃~4℃","weather":"雨夹雪转多云","weather_id":{"fa":"06","fb":"01"},"wind":"北风微风","week":"星期一","date":"20190204"}}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * sk : {"temp":"7","wind_direction":"东南风","wind_strength":"3级","humidity":"65%","time":"13:04"}
         * today : {"temperature":"7℃~9℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期二","city":"南京","date_y":"2019年01月29日","dressing_index":"较冷","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","uv_index":"最弱","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
         * future : {"day_20190129":{"temperature":"7℃~9℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期二","date":"20190129"},"day_20190130":{"temperature":"3℃~9℃","weather":"小雨转雨夹雪","weather_id":{"fa":"07","fb":"06"},"wind":"东北风微风","week":"星期三","date":"20190130"},"day_20190131":{"temperature":"-2℃~4℃","weather":"雨夹雪转多云","weather_id":{"fa":"06","fb":"01"},"wind":"北风微风","week":"星期四","date":"20190131"},"day_20190201":{"temperature":"1℃~6℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期五","date":"20190201"},"day_20190202":{"temperature":"7℃~10℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"西南风微风","week":"星期六","date":"20190202"},"day_20190203":{"temperature":"1℃~6℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期日","date":"20190203"},"day_20190204":{"temperature":"-2℃~4℃","weather":"雨夹雪转多云","weather_id":{"fa":"06","fb":"01"},"wind":"北风微风","week":"星期一","date":"20190204"}}
         */

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            /**
             * temp : 7
             * wind_direction : 东南风
             * wind_strength : 3级
             * humidity : 65%
             * time : 13:04
             */

            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
            /**
             * temperature : 7℃~9℃
             * weather : 多云转阴
             * weather_id : {"fa":"01","fb":"02"}
             * wind : 东风微风
             * week : 星期二
             * city : 南京
             * date_y : 2019年01月29日
             * dressing_index : 较冷
             * dressing_advice : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
             * uv_index : 最弱
             * comfort_index :
             * wash_index : 较适宜
             * travel_index : 较适宜
             * exercise_index : 较适宜
             * drying_index :
             */

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                /**
                 * fa : 01
                 * fb : 02
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            /**
             * day_20190129 : {"temperature":"7℃~9℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期二","date":"20190129"}
             * day_20190130 : {"temperature":"3℃~9℃","weather":"小雨转雨夹雪","weather_id":{"fa":"07","fb":"06"},"wind":"东北风微风","week":"星期三","date":"20190130"}
             * day_20190131 : {"temperature":"-2℃~4℃","weather":"雨夹雪转多云","weather_id":{"fa":"06","fb":"01"},"wind":"北风微风","week":"星期四","date":"20190131"}
             * day_20190201 : {"temperature":"1℃~6℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期五","date":"20190201"}
             * day_20190202 : {"temperature":"7℃~10℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"西南风微风","week":"星期六","date":"20190202"}
             * day_20190203 : {"temperature":"1℃~6℃","weather":"晴","weather_id":{"fa":"00","fb":"00"},"wind":"西南风微风","week":"星期日","date":"20190203"}
             * day_20190204 : {"temperature":"-2℃~4℃","weather":"雨夹雪转多云","weather_id":{"fa":"06","fb":"01"},"wind":"北风微风","week":"星期一","date":"20190204"}
             */

            private Day20190129Bean day_20190129;
            private Day20190130Bean day_20190130;
            private Day20190131Bean day_20190131;
            private Day20190201Bean day_20190201;
            private Day20190202Bean day_20190202;
            private Day20190203Bean day_20190203;
            private Day20190204Bean day_20190204;

            public Day20190129Bean getDay_20190129() {
                return day_20190129;
            }

            public void setDay_20190129(Day20190129Bean day_20190129) {
                this.day_20190129 = day_20190129;
            }

            public Day20190130Bean getDay_20190130() {
                return day_20190130;
            }

            public void setDay_20190130(Day20190130Bean day_20190130) {
                this.day_20190130 = day_20190130;
            }

            public Day20190131Bean getDay_20190131() {
                return day_20190131;
            }

            public void setDay_20190131(Day20190131Bean day_20190131) {
                this.day_20190131 = day_20190131;
            }

            public Day20190201Bean getDay_20190201() {
                return day_20190201;
            }

            public void setDay_20190201(Day20190201Bean day_20190201) {
                this.day_20190201 = day_20190201;
            }

            public Day20190202Bean getDay_20190202() {
                return day_20190202;
            }

            public void setDay_20190202(Day20190202Bean day_20190202) {
                this.day_20190202 = day_20190202;
            }

            public Day20190203Bean getDay_20190203() {
                return day_20190203;
            }

            public void setDay_20190203(Day20190203Bean day_20190203) {
                this.day_20190203 = day_20190203;
            }

            public Day20190204Bean getDay_20190204() {
                return day_20190204;
            }

            public void setDay_20190204(Day20190204Bean day_20190204) {
                this.day_20190204 = day_20190204;
            }

            public static class Day20190129Bean {
                /**
                 * temperature : 7℃~9℃
                 * weather : 多云转阴
                 * weather_id : {"fa":"01","fb":"02"}
                 * wind : 东风微风
                 * week : 星期二
                 * date : 20190129
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanX {
                    /**
                     * fa : 01
                     * fb : 02
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190130Bean {
                /**
                 * temperature : 3℃~9℃
                 * weather : 小雨转雨夹雪
                 * weather_id : {"fa":"07","fb":"06"}
                 * wind : 东北风微风
                 * week : 星期三
                 * date : 20190130
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXX {
                    /**
                     * fa : 07
                     * fb : 06
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190131Bean {
                /**
                 * temperature : -2℃~4℃
                 * weather : 雨夹雪转多云
                 * weather_id : {"fa":"06","fb":"01"}
                 * wind : 北风微风
                 * week : 星期四
                 * date : 20190131
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXX {
                    /**
                     * fa : 06
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190201Bean {
                /**
                 * temperature : 1℃~6℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 西南风微风
                 * week : 星期五
                 * date : 20190201
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXX {
                    /**
                     * fa : 00
                     * fb : 00
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190202Bean {
                /**
                 * temperature : 7℃~10℃
                 * weather : 多云转小雨
                 * weather_id : {"fa":"01","fb":"07"}
                 * wind : 西南风微风
                 * week : 星期六
                 * date : 20190202
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXX {
                    /**
                     * fa : 01
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190203Bean {
                /**
                 * temperature : 1℃~6℃
                 * weather : 晴
                 * weather_id : {"fa":"00","fb":"00"}
                 * wind : 西南风微风
                 * week : 星期日
                 * date : 20190203
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXX {
                    /**
                     * fa : 00
                     * fb : 00
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190204Bean {
                /**
                 * temperature : -2℃~4℃
                 * weather : 雨夹雪转多云
                 * weather_id : {"fa":"06","fb":"01"}
                 * wind : 北风微风
                 * week : 星期一
                 * date : 20190204
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXXX {
                    /**
                     * fa : 06
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }
}
