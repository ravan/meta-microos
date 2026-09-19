SUMMARY = "Date manipulation routines"
DESCRIPTION = "Date::Manip is a series of modules designed to make any common date/time \
operation easy to do. Operations such as comparing two times, determining a \
date a given amount of time from another, or parsing international times \
are all easily done. It deals with time as it is used in the Gregorian \
calendar (the one currently in use) with full support for time changes due \
to daylight saving time. \
 \
From the very beginning, the main focus of Date::Manip has been to be able \
to do ANY desired date/time operation easily. Many other modules exist \
which may do a subset of these operations quicker or more efficiently, but \
no other module can do all of the operations available in Date::Manip. \
 \
Date::Manip has functionality to work with several fundamental types of \
data. \
 \
* *dates* \
 \
The word date is used extensively here and is somewhat misleading. In \
Date::Manip, a date consists of three pieces of information: a calendar \
date (year, month, day), a time of day (hour, minute, second), and time \
zone information. Calendar dates and times are fully handled. Time zones \
are handled as well, but depending on how you use Date::Manip, there may be \
some limitations as discussed below. \
 \
* *delta* \
 \
A delta is an amount of time (i.e. the amount of time between two different \
dates). Think of it as the duration of an event or the amount of time \
between two dates. \
 \
A delta refers only to an amount of time. It includes no information about \
a starting or ending date/time. Most people will think of a delta as an \
amount of time, but the term 'time' is already used so much in this module \
that I didn't want to use it here in order to avoid confusion. \
 \
* *recurrence* \
 \
A recurring event is something which occurs on a regular recurring basis. \
 \
* *holidays* and *events* \
 \
Holidays and events are basically named dates or recurrences. \
 \
Among other things, Date::Manip allow you to: \
 \
* *** \
 \
Enter a date in practically any format you choose. \
 \
* *** \
 \
Compare two dates, entered in widely different formats to determine which \
is earlier. \
 \
* *** \
 \
Extract any information you want from a date using a format string similar \
to the Unix date command. \
 \
* *** \
 \
Determine the amount of time between two dates, or add an amount of time (a \
delta) to a date to get a second date. \
 \
* *** \
 \
Work with dates using international formats (foreign month names, 12/10/95 \
referring to October rather than December, etc.). \
 \
* *** \
 \
Convert dates from one timezone to another. \
 \
* *** \
 \
To find a list of dates where a recurring event happens. \
 \
Each of these tasks is trivial (one or two lines at most) with this \
package."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.990.0"

RPM_NAME = "perl-Date-Manip-6.990.0-2.1.aarch64.rpm"
RPM_HASH = "2bb726493fa7b38105d373c188313e1f2ea5cc04409a8f2ddc6f524a5ec5fffe99b167b51598a48871374358344d3b8af7291c3b3aa19c15217de34f358e076c"

RPROVIDES:${PN} += "perl-Date--Manip \
perl-Date--Manip--Base \
perl-Date--Manip--DM5 \
perl-Date--Manip--DM5abbrevs \
perl-Date--Manip--DM6 \
perl-Date--Manip--Date \
perl-Date--Manip--Delta \
perl-Date--Manip--Lang--catalan \
perl-Date--Manip--Lang--danish \
perl-Date--Manip--Lang--dutch \
perl-Date--Manip--Lang--english \
perl-Date--Manip--Lang--finnish \
perl-Date--Manip--Lang--french \
perl-Date--Manip--Lang--german \
perl-Date--Manip--Lang--index \
perl-Date--Manip--Lang--italian \
perl-Date--Manip--Lang--norwegian \
perl-Date--Manip--Lang--polish \
perl-Date--Manip--Lang--portugue \
perl-Date--Manip--Lang--romanian \
perl-Date--Manip--Lang--russian \
perl-Date--Manip--Lang--spanish \
perl-Date--Manip--Lang--swedish \
perl-Date--Manip--Lang--turkish \
perl-Date--Manip--Obj \
perl-Date--Manip--Offset--off000 \
perl-Date--Manip--Offset--off001 \
perl-Date--Manip--Offset--off002 \
perl-Date--Manip--Offset--off003 \
perl-Date--Manip--Offset--off004 \
perl-Date--Manip--Offset--off005 \
perl-Date--Manip--Offset--off006 \
perl-Date--Manip--Offset--off007 \
perl-Date--Manip--Offset--off008 \
perl-Date--Manip--Offset--off009 \
perl-Date--Manip--Offset--off010 \
perl-Date--Manip--Offset--off011 \
perl-Date--Manip--Offset--off012 \
perl-Date--Manip--Offset--off013 \
perl-Date--Manip--Offset--off014 \
perl-Date--Manip--Offset--off015 \
perl-Date--Manip--Offset--off016 \
perl-Date--Manip--Offset--off017 \
perl-Date--Manip--Offset--off018 \
perl-Date--Manip--Offset--off019 \
perl-Date--Manip--Offset--off020 \
perl-Date--Manip--Offset--off021 \
perl-Date--Manip--Offset--off022 \
perl-Date--Manip--Offset--off023 \
perl-Date--Manip--Offset--off024 \
perl-Date--Manip--Offset--off025 \
perl-Date--Manip--Offset--off026 \
perl-Date--Manip--Offset--off027 \
perl-Date--Manip--Offset--off028 \
perl-Date--Manip--Offset--off029 \
perl-Date--Manip--Offset--off030 \
perl-Date--Manip--Offset--off031 \
perl-Date--Manip--Offset--off032 \
perl-Date--Manip--Offset--off033 \
perl-Date--Manip--Offset--off034 \
perl-Date--Manip--Offset--off035 \
perl-Date--Manip--Offset--off036 \
perl-Date--Manip--Offset--off037 \
perl-Date--Manip--Offset--off038 \
perl-Date--Manip--Offset--off039 \
perl-Date--Manip--Offset--off040 \
perl-Date--Manip--Offset--off041 \
perl-Date--Manip--Offset--off042 \
perl-Date--Manip--Offset--off043 \
perl-Date--Manip--Offset--off044 \
perl-Date--Manip--Offset--off045 \
perl-Date--Manip--Offset--off046 \
perl-Date--Manip--Offset--off047 \
perl-Date--Manip--Offset--off048 \
perl-Date--Manip--Offset--off049 \
perl-Date--Manip--Offset--off050 \
perl-Date--Manip--Offset--off051 \
perl-Date--Manip--Offset--off052 \
perl-Date--Manip--Offset--off053 \
perl-Date--Manip--Offset--off054 \
perl-Date--Manip--Offset--off055 \
perl-Date--Manip--Offset--off056 \
perl-Date--Manip--Offset--off057 \
perl-Date--Manip--Offset--off058 \
perl-Date--Manip--Offset--off059 \
perl-Date--Manip--Offset--off060 \
perl-Date--Manip--Offset--off061 \
perl-Date--Manip--Offset--off062 \
perl-Date--Manip--Offset--off063 \
perl-Date--Manip--Offset--off064 \
perl-Date--Manip--Offset--off065 \
perl-Date--Manip--Offset--off066 \
perl-Date--Manip--Offset--off067 \
perl-Date--Manip--Offset--off068 \
perl-Date--Manip--Offset--off069 \
perl-Date--Manip--Offset--off070 \
perl-Date--Manip--Offset--off071 \
perl-Date--Manip--Offset--off072 \
perl-Date--Manip--Offset--off073 \
perl-Date--Manip--Offset--off074 \
perl-Date--Manip--Offset--off075 \
perl-Date--Manip--Offset--off076 \
perl-Date--Manip--Offset--off077 \
perl-Date--Manip--Offset--off078 \
perl-Date--Manip--Offset--off079 \
perl-Date--Manip--Offset--off080 \
perl-Date--Manip--Offset--off081 \
perl-Date--Manip--Offset--off082 \
perl-Date--Manip--Offset--off083 \
perl-Date--Manip--Offset--off084 \
perl-Date--Manip--Offset--off085 \
perl-Date--Manip--Offset--off086 \
perl-Date--Manip--Offset--off087 \
perl-Date--Manip--Offset--off088 \
perl-Date--Manip--Offset--off089 \
perl-Date--Manip--Offset--off090 \
perl-Date--Manip--Offset--off091 \
perl-Date--Manip--Offset--off092 \
perl-Date--Manip--Offset--off093 \
perl-Date--Manip--Offset--off094 \
perl-Date--Manip--Offset--off095 \
perl-Date--Manip--Offset--off096 \
perl-Date--Manip--Offset--off097 \
perl-Date--Manip--Offset--off098 \
perl-Date--Manip--Offset--off099 \
perl-Date--Manip--Offset--off100 \
perl-Date--Manip--Offset--off101 \
perl-Date--Manip--Offset--off102 \
perl-Date--Manip--Offset--off103 \
perl-Date--Manip--Offset--off104 \
perl-Date--Manip--Offset--off105 \
perl-Date--Manip--Offset--off106 \
perl-Date--Manip--Offset--off107 \
perl-Date--Manip--Offset--off108 \
perl-Date--Manip--Offset--off109 \
perl-Date--Manip--Offset--off110 \
perl-Date--Manip--Offset--off111 \
perl-Date--Manip--Offset--off112 \
perl-Date--Manip--Offset--off113 \
perl-Date--Manip--Offset--off114 \
perl-Date--Manip--Offset--off115 \
perl-Date--Manip--Offset--off116 \
perl-Date--Manip--Offset--off117 \
perl-Date--Manip--Offset--off118 \
perl-Date--Manip--Offset--off119 \
perl-Date--Manip--Offset--off120 \
perl-Date--Manip--Offset--off121 \
perl-Date--Manip--Offset--off122 \
perl-Date--Manip--Offset--off123 \
perl-Date--Manip--Offset--off124 \
perl-Date--Manip--Offset--off125 \
perl-Date--Manip--Offset--off126 \
perl-Date--Manip--Offset--off127 \
perl-Date--Manip--Offset--off128 \
perl-Date--Manip--Offset--off129 \
perl-Date--Manip--Offset--off130 \
perl-Date--Manip--Offset--off131 \
perl-Date--Manip--Offset--off132 \
perl-Date--Manip--Offset--off133 \
perl-Date--Manip--Offset--off134 \
perl-Date--Manip--Offset--off135 \
perl-Date--Manip--Offset--off136 \
perl-Date--Manip--Offset--off137 \
perl-Date--Manip--Offset--off138 \
perl-Date--Manip--Offset--off139 \
perl-Date--Manip--Offset--off140 \
perl-Date--Manip--Offset--off141 \
perl-Date--Manip--Offset--off142 \
perl-Date--Manip--Offset--off143 \
perl-Date--Manip--Offset--off144 \
perl-Date--Manip--Offset--off145 \
perl-Date--Manip--Offset--off146 \
perl-Date--Manip--Offset--off147 \
perl-Date--Manip--Offset--off148 \
perl-Date--Manip--Offset--off149 \
perl-Date--Manip--Offset--off150 \
perl-Date--Manip--Offset--off151 \
perl-Date--Manip--Offset--off152 \
perl-Date--Manip--Offset--off153 \
perl-Date--Manip--Offset--off154 \
perl-Date--Manip--Offset--off155 \
perl-Date--Manip--Offset--off156 \
perl-Date--Manip--Offset--off157 \
perl-Date--Manip--Offset--off158 \
perl-Date--Manip--Offset--off159 \
perl-Date--Manip--Offset--off160 \
perl-Date--Manip--Offset--off161 \
perl-Date--Manip--Offset--off162 \
perl-Date--Manip--Offset--off163 \
perl-Date--Manip--Offset--off164 \
perl-Date--Manip--Offset--off165 \
perl-Date--Manip--Offset--off166 \
perl-Date--Manip--Offset--off167 \
perl-Date--Manip--Offset--off168 \
perl-Date--Manip--Offset--off169 \
perl-Date--Manip--Offset--off170 \
perl-Date--Manip--Offset--off171 \
perl-Date--Manip--Offset--off172 \
perl-Date--Manip--Offset--off173 \
perl-Date--Manip--Offset--off174 \
perl-Date--Manip--Offset--off175 \
perl-Date--Manip--Offset--off176 \
perl-Date--Manip--Offset--off177 \
perl-Date--Manip--Offset--off178 \
perl-Date--Manip--Offset--off179 \
perl-Date--Manip--Offset--off180 \
perl-Date--Manip--Offset--off181 \
perl-Date--Manip--Offset--off182 \
perl-Date--Manip--Offset--off183 \
perl-Date--Manip--Offset--off184 \
perl-Date--Manip--Offset--off185 \
perl-Date--Manip--Offset--off186 \
perl-Date--Manip--Offset--off187 \
perl-Date--Manip--Offset--off188 \
perl-Date--Manip--Offset--off189 \
perl-Date--Manip--Offset--off190 \
perl-Date--Manip--Offset--off191 \
perl-Date--Manip--Offset--off192 \
perl-Date--Manip--Offset--off193 \
perl-Date--Manip--Offset--off194 \
perl-Date--Manip--Offset--off195 \
perl-Date--Manip--Offset--off196 \
perl-Date--Manip--Offset--off197 \
perl-Date--Manip--Offset--off198 \
perl-Date--Manip--Offset--off199 \
perl-Date--Manip--Offset--off200 \
perl-Date--Manip--Offset--off201 \
perl-Date--Manip--Offset--off202 \
perl-Date--Manip--Offset--off203 \
perl-Date--Manip--Offset--off204 \
perl-Date--Manip--Offset--off205 \
perl-Date--Manip--Offset--off206 \
perl-Date--Manip--Offset--off207 \
perl-Date--Manip--Offset--off208 \
perl-Date--Manip--Offset--off209 \
perl-Date--Manip--Offset--off210 \
perl-Date--Manip--Offset--off211 \
perl-Date--Manip--Offset--off212 \
perl-Date--Manip--Offset--off213 \
perl-Date--Manip--Offset--off214 \
perl-Date--Manip--Offset--off215 \
perl-Date--Manip--Offset--off216 \
perl-Date--Manip--Offset--off217 \
perl-Date--Manip--Offset--off218 \
perl-Date--Manip--Offset--off219 \
perl-Date--Manip--Offset--off220 \
perl-Date--Manip--Offset--off221 \
perl-Date--Manip--Offset--off222 \
perl-Date--Manip--Offset--off223 \
perl-Date--Manip--Offset--off224 \
perl-Date--Manip--Offset--off225 \
perl-Date--Manip--Offset--off226 \
perl-Date--Manip--Offset--off227 \
perl-Date--Manip--Offset--off228 \
perl-Date--Manip--Offset--off229 \
perl-Date--Manip--Offset--off230 \
perl-Date--Manip--Offset--off231 \
perl-Date--Manip--Offset--off232 \
perl-Date--Manip--Offset--off233 \
perl-Date--Manip--Offset--off234 \
perl-Date--Manip--Offset--off235 \
perl-Date--Manip--Offset--off236 \
perl-Date--Manip--Offset--off237 \
perl-Date--Manip--Offset--off238 \
perl-Date--Manip--Offset--off239 \
perl-Date--Manip--Offset--off240 \
perl-Date--Manip--Offset--off241 \
perl-Date--Manip--Offset--off242 \
perl-Date--Manip--Offset--off243 \
perl-Date--Manip--Offset--off244 \
perl-Date--Manip--Offset--off245 \
perl-Date--Manip--Offset--off246 \
perl-Date--Manip--Offset--off247 \
perl-Date--Manip--Offset--off248 \
perl-Date--Manip--Offset--off249 \
perl-Date--Manip--Offset--off250 \
perl-Date--Manip--Offset--off251 \
perl-Date--Manip--Offset--off252 \
perl-Date--Manip--Offset--off253 \
perl-Date--Manip--Offset--off254 \
perl-Date--Manip--Offset--off255 \
perl-Date--Manip--Offset--off256 \
perl-Date--Manip--Offset--off257 \
perl-Date--Manip--Offset--off258 \
perl-Date--Manip--Offset--off259 \
perl-Date--Manip--Offset--off260 \
perl-Date--Manip--Offset--off261 \
perl-Date--Manip--Offset--off262 \
perl-Date--Manip--Offset--off263 \
perl-Date--Manip--Offset--off264 \
perl-Date--Manip--Offset--off265 \
perl-Date--Manip--Offset--off266 \
perl-Date--Manip--Offset--off267 \
perl-Date--Manip--Offset--off268 \
perl-Date--Manip--Offset--off269 \
perl-Date--Manip--Offset--off270 \
perl-Date--Manip--Offset--off271 \
perl-Date--Manip--Offset--off272 \
perl-Date--Manip--Offset--off273 \
perl-Date--Manip--Offset--off274 \
perl-Date--Manip--Offset--off275 \
perl-Date--Manip--Offset--off276 \
perl-Date--Manip--Offset--off277 \
perl-Date--Manip--Offset--off278 \
perl-Date--Manip--Offset--off279 \
perl-Date--Manip--Offset--off280 \
perl-Date--Manip--Offset--off281 \
perl-Date--Manip--Offset--off282 \
perl-Date--Manip--Offset--off283 \
perl-Date--Manip--Offset--off284 \
perl-Date--Manip--Offset--off285 \
perl-Date--Manip--Offset--off286 \
perl-Date--Manip--Offset--off287 \
perl-Date--Manip--Offset--off288 \
perl-Date--Manip--Offset--off289 \
perl-Date--Manip--Offset--off290 \
perl-Date--Manip--Offset--off291 \
perl-Date--Manip--Offset--off292 \
perl-Date--Manip--Offset--off293 \
perl-Date--Manip--Offset--off294 \
perl-Date--Manip--Offset--off295 \
perl-Date--Manip--Offset--off296 \
perl-Date--Manip--Offset--off297 \
perl-Date--Manip--Offset--off298 \
perl-Date--Manip--Offset--off299 \
perl-Date--Manip--Offset--off300 \
perl-Date--Manip--Offset--off301 \
perl-Date--Manip--Offset--off302 \
perl-Date--Manip--Offset--off303 \
perl-Date--Manip--Offset--off304 \
perl-Date--Manip--Offset--off305 \
perl-Date--Manip--Offset--off306 \
perl-Date--Manip--Offset--off307 \
perl-Date--Manip--Offset--off308 \
perl-Date--Manip--Offset--off309 \
perl-Date--Manip--Offset--off310 \
perl-Date--Manip--Offset--off311 \
perl-Date--Manip--Offset--off312 \
perl-Date--Manip--Offset--off313 \
perl-Date--Manip--Offset--off314 \
perl-Date--Manip--Offset--off315 \
perl-Date--Manip--Offset--off316 \
perl-Date--Manip--Offset--off317 \
perl-Date--Manip--Offset--off318 \
perl-Date--Manip--Offset--off319 \
perl-Date--Manip--Offset--off320 \
perl-Date--Manip--Offset--off321 \
perl-Date--Manip--Offset--off322 \
perl-Date--Manip--Offset--off323 \
perl-Date--Manip--Offset--off324 \
perl-Date--Manip--Offset--off325 \
perl-Date--Manip--Offset--off326 \
perl-Date--Manip--Offset--off327 \
perl-Date--Manip--Offset--off328 \
perl-Date--Manip--Offset--off329 \
perl-Date--Manip--Offset--off330 \
perl-Date--Manip--Offset--off331 \
perl-Date--Manip--Offset--off332 \
perl-Date--Manip--Offset--off333 \
perl-Date--Manip--Offset--off334 \
perl-Date--Manip--Offset--off335 \
perl-Date--Manip--Offset--off336 \
perl-Date--Manip--Offset--off337 \
perl-Date--Manip--Offset--off338 \
perl-Date--Manip--Offset--off339 \
perl-Date--Manip--Offset--off340 \
perl-Date--Manip--Offset--off341 \
perl-Date--Manip--Offset--off342 \
perl-Date--Manip--Offset--off343 \
perl-Date--Manip--Offset--off344 \
perl-Date--Manip--Offset--off345 \
perl-Date--Manip--Offset--off346 \
perl-Date--Manip--Offset--off347 \
perl-Date--Manip--Offset--off348 \
perl-Date--Manip--Offset--off349 \
perl-Date--Manip--Offset--off350 \
perl-Date--Manip--Offset--off351 \
perl-Date--Manip--Offset--off352 \
perl-Date--Manip--Offset--off353 \
perl-Date--Manip--Offset--off354 \
perl-Date--Manip--Offset--off355 \
perl-Date--Manip--Offset--off356 \
perl-Date--Manip--Offset--off357 \
perl-Date--Manip--Offset--off358 \
perl-Date--Manip--Offset--off359 \
perl-Date--Manip--Offset--off360 \
perl-Date--Manip--Offset--off361 \
perl-Date--Manip--Offset--off362 \
perl-Date--Manip--Offset--off363 \
perl-Date--Manip--Offset--off364 \
perl-Date--Manip--Offset--off365 \
perl-Date--Manip--Offset--off366 \
perl-Date--Manip--Offset--off367 \
perl-Date--Manip--Offset--off368 \
perl-Date--Manip--Offset--off369 \
perl-Date--Manip--Offset--off370 \
perl-Date--Manip--Offset--off371 \
perl-Date--Manip--Offset--off372 \
perl-Date--Manip--Offset--off373 \
perl-Date--Manip--Offset--off374 \
perl-Date--Manip--Offset--off375 \
perl-Date--Manip--Offset--off376 \
perl-Date--Manip--Offset--off377 \
perl-Date--Manip--Offset--off378 \
perl-Date--Manip--Offset--off379 \
perl-Date--Manip--Offset--off380 \
perl-Date--Manip--Offset--off381 \
perl-Date--Manip--Offset--off382 \
perl-Date--Manip--Offset--off383 \
perl-Date--Manip--Offset--off384 \
perl-Date--Manip--Offset--off385 \
perl-Date--Manip--Offset--off386 \
perl-Date--Manip--Offset--off387 \
perl-Date--Manip--Offset--off388 \
perl-Date--Manip--Offset--off389 \
perl-Date--Manip--Offset--off390 \
perl-Date--Manip--Offset--off391 \
perl-Date--Manip--Offset--off392 \
perl-Date--Manip--Offset--off393 \
perl-Date--Manip--Offset--off394 \
perl-Date--Manip--Offset--off395 \
perl-Date--Manip--Offset--off396 \
perl-Date--Manip--Offset--off397 \
perl-Date--Manip--Offset--off398 \
perl-Date--Manip--Offset--off399 \
perl-Date--Manip--Offset--off400 \
perl-Date--Manip--Offset--off401 \
perl-Date--Manip--Offset--off402 \
perl-Date--Manip--Offset--off403 \
perl-Date--Manip--Offset--off404 \
perl-Date--Manip--Offset--off405 \
perl-Date--Manip--Offset--off406 \
perl-Date--Manip--Offset--off407 \
perl-Date--Manip--Recur \
perl-Date--Manip--TZ \
perl-Date--Manip--TZ--a00 \
perl-Date--Manip--TZ--afabid00 \
perl-Date--Manip--TZ--afalgi00 \
perl-Date--Manip--TZ--afbiss00 \
perl-Date--Manip--TZ--afcair00 \
perl-Date--Manip--TZ--afcasa00 \
perl-Date--Manip--TZ--afceut00 \
perl-Date--Manip--TZ--afel-a00 \
perl-Date--Manip--TZ--afjoha00 \
perl-Date--Manip--TZ--afjuba00 \
perl-Date--Manip--TZ--afkhar00 \
perl-Date--Manip--TZ--aflago00 \
perl-Date--Manip--TZ--afmapu00 \
perl-Date--Manip--TZ--afmonr00 \
perl-Date--Manip--TZ--afnair00 \
perl-Date--Manip--TZ--afndja00 \
perl-Date--Manip--TZ--afsao-00 \
perl-Date--Manip--TZ--aftrip00 \
perl-Date--Manip--TZ--aftuni00 \
perl-Date--Manip--TZ--afwind00 \
perl-Date--Manip--TZ--amadak00 \
perl-Date--Manip--TZ--amanch00 \
perl-Date--Manip--TZ--amarag00 \
perl-Date--Manip--TZ--amasun00 \
perl-Date--Manip--TZ--ambahi00 \
perl-Date--Manip--TZ--ambahi01 \
perl-Date--Manip--TZ--ambarb00 \
perl-Date--Manip--TZ--ambele00 \
perl-Date--Manip--TZ--ambeli00 \
perl-Date--Manip--TZ--ambeul00 \
perl-Date--Manip--TZ--amboa-00 \
perl-Date--Manip--TZ--ambogo00 \
perl-Date--Manip--TZ--ambois00 \
perl-Date--Manip--TZ--ambuen00 \
perl-Date--Manip--TZ--amcamb00 \
perl-Date--Manip--TZ--amcamp00 \
perl-Date--Manip--TZ--amcanc00 \
perl-Date--Manip--TZ--amcara00 \
perl-Date--Manip--TZ--amcata00 \
perl-Date--Manip--TZ--amcaye00 \
perl-Date--Manip--TZ--amcent00 \
perl-Date--Manip--TZ--amchic00 \
perl-Date--Manip--TZ--amchih00 \
perl-Date--Manip--TZ--amciud00 \
perl-Date--Manip--TZ--amcord00 \
perl-Date--Manip--TZ--amcost00 \
perl-Date--Manip--TZ--amcoyh00 \
perl-Date--Manip--TZ--amcuia00 \
perl-Date--Manip--TZ--amdanm00 \
perl-Date--Manip--TZ--amdaws00 \
perl-Date--Manip--TZ--amdaws01 \
perl-Date--Manip--TZ--amdenv00 \
perl-Date--Manip--TZ--amdetr00 \
perl-Date--Manip--TZ--amedmo00 \
perl-Date--Manip--TZ--ameiru00 \
perl-Date--Manip--TZ--amel-s00 \
perl-Date--Manip--TZ--amfort00 \
perl-Date--Manip--TZ--amfort01 \
perl-Date--Manip--TZ--amglac00 \
perl-Date--Manip--TZ--amgoos00 \
perl-Date--Manip--TZ--amgran00 \
perl-Date--Manip--TZ--amguat00 \
perl-Date--Manip--TZ--amguay00 \
perl-Date--Manip--TZ--amguya00 \
perl-Date--Manip--TZ--amhali00 \
perl-Date--Manip--TZ--amhava00 \
perl-Date--Manip--TZ--amherm00 \
perl-Date--Manip--TZ--amindi00 \
perl-Date--Manip--TZ--aminuv00 \
perl-Date--Manip--TZ--amiqal00 \
perl-Date--Manip--TZ--amjama00 \
perl-Date--Manip--TZ--amjuju00 \
perl-Date--Manip--TZ--amjune00 \
perl-Date--Manip--TZ--amknox00 \
perl-Date--Manip--TZ--amla-p00 \
perl-Date--Manip--TZ--amla-r00 \
perl-Date--Manip--TZ--amlima00 \
perl-Date--Manip--TZ--amlos-00 \
perl-Date--Manip--TZ--amloui00 \
perl-Date--Manip--TZ--ammace00 \
perl-Date--Manip--TZ--ammana00 \
perl-Date--Manip--TZ--ammana01 \
perl-Date--Manip--TZ--ammare00 \
perl-Date--Manip--TZ--ammart00 \
perl-Date--Manip--TZ--ammata00 \
perl-Date--Manip--TZ--ammaza00 \
perl-Date--Manip--TZ--ammend00 \
perl-Date--Manip--TZ--ammeno00 \
perl-Date--Manip--TZ--ammeri00 \
perl-Date--Manip--TZ--ammetl00 \
perl-Date--Manip--TZ--ammexi00 \
perl-Date--Manip--TZ--ammiqu00 \
perl-Date--Manip--TZ--ammonc00 \
perl-Date--Manip--TZ--ammont00 \
perl-Date--Manip--TZ--ammont01 \
perl-Date--Manip--TZ--ammont02 \
perl-Date--Manip--TZ--amnew-00 \
perl-Date--Manip--TZ--amnew-01 \
perl-Date--Manip--TZ--amnome00 \
perl-Date--Manip--TZ--amnoro00 \
perl-Date--Manip--TZ--amnuuk00 \
perl-Date--Manip--TZ--amojin00 \
perl-Date--Manip--TZ--ampana00 \
perl-Date--Manip--TZ--ampara00 \
perl-Date--Manip--TZ--ampete00 \
perl-Date--Manip--TZ--amphoe00 \
perl-Date--Manip--TZ--amport00 \
perl-Date--Manip--TZ--amport01 \
perl-Date--Manip--TZ--ampuer00 \
perl-Date--Manip--TZ--ampunt00 \
perl-Date--Manip--TZ--amrank00 \
perl-Date--Manip--TZ--amreci00 \
perl-Date--Manip--TZ--amregi00 \
perl-Date--Manip--TZ--amreso00 \
perl-Date--Manip--TZ--amrio-00 \
perl-Date--Manip--TZ--amrio-01 \
perl-Date--Manip--TZ--amsalt00 \
perl-Date--Manip--TZ--amsan-00 \
perl-Date--Manip--TZ--amsan-01 \
perl-Date--Manip--TZ--amsant00 \
perl-Date--Manip--TZ--amsant01 \
perl-Date--Manip--TZ--amsant02 \
perl-Date--Manip--TZ--amsao-00 \
perl-Date--Manip--TZ--amscor00 \
perl-Date--Manip--TZ--amsitk00 \
perl-Date--Manip--TZ--amst-j00 \
perl-Date--Manip--TZ--amswif00 \
perl-Date--Manip--TZ--amtegu00 \
perl-Date--Manip--TZ--amtell00 \
perl-Date--Manip--TZ--amthul00 \
perl-Date--Manip--TZ--amtiju00 \
perl-Date--Manip--TZ--amtoro00 \
perl-Date--Manip--TZ--amtucu00 \
perl-Date--Manip--TZ--amushu00 \
perl-Date--Manip--TZ--amvanc00 \
perl-Date--Manip--TZ--amveva00 \
perl-Date--Manip--TZ--amvinc00 \
perl-Date--Manip--TZ--amwhit00 \
perl-Date--Manip--TZ--amwina00 \
perl-Date--Manip--TZ--amwinn00 \
perl-Date--Manip--TZ--amyaku00 \
perl-Date--Manip--TZ--ancase00 \
perl-Date--Manip--TZ--andavi00 \
perl-Date--Manip--TZ--anmacq00 \
perl-Date--Manip--TZ--anmaws00 \
perl-Date--Manip--TZ--anpalm00 \
perl-Date--Manip--TZ--anroth00 \
perl-Date--Manip--TZ--antrol00 \
perl-Date--Manip--TZ--anvost00 \
perl-Date--Manip--TZ--asalma00 \
perl-Date--Manip--TZ--asamma00 \
perl-Date--Manip--TZ--asanad00 \
perl-Date--Manip--TZ--asaqta00 \
perl-Date--Manip--TZ--asaqto00 \
perl-Date--Manip--TZ--asashg00 \
perl-Date--Manip--TZ--asatyr00 \
perl-Date--Manip--TZ--asbagh00 \
perl-Date--Manip--TZ--asbaku00 \
perl-Date--Manip--TZ--asbang00 \
perl-Date--Manip--TZ--asbarn00 \
perl-Date--Manip--TZ--asbeir00 \
perl-Date--Manip--TZ--asbish00 \
perl-Date--Manip--TZ--aschit00 \
perl-Date--Manip--TZ--ascolo00 \
perl-Date--Manip--TZ--asdama00 \
perl-Date--Manip--TZ--asdhak00 \
perl-Date--Manip--TZ--asdili00 \
perl-Date--Manip--TZ--asduba00 \
perl-Date--Manip--TZ--asdush00 \
perl-Date--Manip--TZ--asfama00 \
perl-Date--Manip--TZ--asgaza00 \
perl-Date--Manip--TZ--ashebr00 \
perl-Date--Manip--TZ--asho-c00 \
perl-Date--Manip--TZ--ashong00 \
perl-Date--Manip--TZ--ashovd00 \
perl-Date--Manip--TZ--asirku00 \
perl-Date--Manip--TZ--asjaka00 \
perl-Date--Manip--TZ--asjaya00 \
perl-Date--Manip--TZ--asjeru00 \
perl-Date--Manip--TZ--askabu00 \
perl-Date--Manip--TZ--askamc00 \
perl-Date--Manip--TZ--askara00 \
perl-Date--Manip--TZ--askath00 \
perl-Date--Manip--TZ--askhan00 \
perl-Date--Manip--TZ--askolk00 \
perl-Date--Manip--TZ--askras00 \
perl-Date--Manip--TZ--askuch00 \
perl-Date--Manip--TZ--asmaca00 \
perl-Date--Manip--TZ--asmaga00 \
perl-Date--Manip--TZ--asmaka00 \
perl-Date--Manip--TZ--asmani00 \
perl-Date--Manip--TZ--asnico00 \
perl-Date--Manip--TZ--asnovo00 \
perl-Date--Manip--TZ--asnovo01 \
perl-Date--Manip--TZ--asomsk00 \
perl-Date--Manip--TZ--asoral00 \
perl-Date--Manip--TZ--aspont00 \
perl-Date--Manip--TZ--aspyon00 \
perl-Date--Manip--TZ--asqata00 \
perl-Date--Manip--TZ--asqost00 \
perl-Date--Manip--TZ--asqyzy00 \
perl-Date--Manip--TZ--asriya00 \
perl-Date--Manip--TZ--assakh00 \
perl-Date--Manip--TZ--assama00 \
perl-Date--Manip--TZ--asseou00 \
perl-Date--Manip--TZ--asshan00 \
perl-Date--Manip--TZ--assing00 \
perl-Date--Manip--TZ--assred00 \
perl-Date--Manip--TZ--astaip00 \
perl-Date--Manip--TZ--astash00 \
perl-Date--Manip--TZ--astbil00 \
perl-Date--Manip--TZ--astehr00 \
perl-Date--Manip--TZ--asthim00 \
perl-Date--Manip--TZ--astoky00 \
perl-Date--Manip--TZ--astoms00 \
perl-Date--Manip--TZ--asulaa00 \
perl-Date--Manip--TZ--asurum00 \
perl-Date--Manip--TZ--asustm00 \
perl-Date--Manip--TZ--asvlad00 \
perl-Date--Manip--TZ--asyaku00 \
perl-Date--Manip--TZ--asyang00 \
perl-Date--Manip--TZ--asyeka00 \
perl-Date--Manip--TZ--asyere00 \
perl-Date--Manip--TZ--atazor00 \
perl-Date--Manip--TZ--atberm00 \
perl-Date--Manip--TZ--atcana00 \
perl-Date--Manip--TZ--atcape00 \
perl-Date--Manip--TZ--atfaro00 \
perl-Date--Manip--TZ--atmade00 \
perl-Date--Manip--TZ--atsout00 \
perl-Date--Manip--TZ--atstan00 \
perl-Date--Manip--TZ--auadel00 \
perl-Date--Manip--TZ--aubris00 \
perl-Date--Manip--TZ--aubrok00 \
perl-Date--Manip--TZ--audarw00 \
perl-Date--Manip--TZ--aueucl00 \
perl-Date--Manip--TZ--auhoba00 \
perl-Date--Manip--TZ--aulind00 \
perl-Date--Manip--TZ--aulord00 \
perl-Date--Manip--TZ--aumelb00 \
perl-Date--Manip--TZ--aupert00 \
perl-Date--Manip--TZ--ausydn00 \
perl-Date--Manip--TZ--b00 \
perl-Date--Manip--TZ--c00 \
perl-Date--Manip--TZ--d00 \
perl-Date--Manip--TZ--e00 \
perl-Date--Manip--TZ--etgmt00 \
perl-Date--Manip--TZ--etgmtm00 \
perl-Date--Manip--TZ--etgmtm01 \
perl-Date--Manip--TZ--etgmtm02 \
perl-Date--Manip--TZ--etgmtm03 \
perl-Date--Manip--TZ--etgmtm04 \
perl-Date--Manip--TZ--etgmtm05 \
perl-Date--Manip--TZ--etgmtm06 \
perl-Date--Manip--TZ--etgmtm07 \
perl-Date--Manip--TZ--etgmtm08 \
perl-Date--Manip--TZ--etgmtm09 \
perl-Date--Manip--TZ--etgmtm10 \
perl-Date--Manip--TZ--etgmtm11 \
perl-Date--Manip--TZ--etgmtm12 \
perl-Date--Manip--TZ--etgmtm13 \
perl-Date--Manip--TZ--etgmtp00 \
perl-Date--Manip--TZ--etgmtp01 \
perl-Date--Manip--TZ--etgmtp02 \
perl-Date--Manip--TZ--etgmtp03 \
perl-Date--Manip--TZ--etgmtp04 \
perl-Date--Manip--TZ--etgmtp05 \
perl-Date--Manip--TZ--etgmtp06 \
perl-Date--Manip--TZ--etgmtp07 \
perl-Date--Manip--TZ--etgmtp08 \
perl-Date--Manip--TZ--etgmtp09 \
perl-Date--Manip--TZ--etgmtp10 \
perl-Date--Manip--TZ--etgmtp11 \
perl-Date--Manip--TZ--etutc00 \
perl-Date--Manip--TZ--euando00 \
perl-Date--Manip--TZ--euastr00 \
perl-Date--Manip--TZ--euathe00 \
perl-Date--Manip--TZ--eubelg00 \
perl-Date--Manip--TZ--euberl00 \
perl-Date--Manip--TZ--eubrus00 \
perl-Date--Manip--TZ--eubuch00 \
perl-Date--Manip--TZ--eubuda00 \
perl-Date--Manip--TZ--euchis00 \
perl-Date--Manip--TZ--eudubl00 \
perl-Date--Manip--TZ--eugibr00 \
perl-Date--Manip--TZ--euhels00 \
perl-Date--Manip--TZ--euista00 \
perl-Date--Manip--TZ--eukali00 \
perl-Date--Manip--TZ--eukiro00 \
perl-Date--Manip--TZ--eukyiv00 \
perl-Date--Manip--TZ--eulisb00 \
perl-Date--Manip--TZ--eulond00 \
perl-Date--Manip--TZ--eumadr00 \
perl-Date--Manip--TZ--eumalt00 \
perl-Date--Manip--TZ--eumins00 \
perl-Date--Manip--TZ--eumosc00 \
perl-Date--Manip--TZ--eupari00 \
perl-Date--Manip--TZ--euprag00 \
perl-Date--Manip--TZ--euriga00 \
perl-Date--Manip--TZ--eurome00 \
perl-Date--Manip--TZ--eusama00 \
perl-Date--Manip--TZ--eusara00 \
perl-Date--Manip--TZ--eusimf00 \
perl-Date--Manip--TZ--eusofi00 \
perl-Date--Manip--TZ--eutall00 \
perl-Date--Manip--TZ--eutira00 \
perl-Date--Manip--TZ--euulya00 \
perl-Date--Manip--TZ--euvien00 \
perl-Date--Manip--TZ--euviln00 \
perl-Date--Manip--TZ--euvolg00 \
perl-Date--Manip--TZ--euwars00 \
perl-Date--Manip--TZ--euzuri00 \
perl-Date--Manip--TZ--f00 \
perl-Date--Manip--TZ--g00 \
perl-Date--Manip--TZ--h00 \
perl-Date--Manip--TZ--i00 \
perl-Date--Manip--TZ--inchag00 \
perl-Date--Manip--TZ--inmald00 \
perl-Date--Manip--TZ--inmaur00 \
perl-Date--Manip--TZ--k00 \
perl-Date--Manip--TZ--l00 \
perl-Date--Manip--TZ--m00 \
perl-Date--Manip--TZ--n00 \
perl-Date--Manip--TZ--o00 \
perl-Date--Manip--TZ--p00 \
perl-Date--Manip--TZ--paapia00 \
perl-Date--Manip--TZ--paauck00 \
perl-Date--Manip--TZ--paboug00 \
perl-Date--Manip--TZ--pachat00 \
perl-Date--Manip--TZ--paeast00 \
perl-Date--Manip--TZ--paefat00 \
perl-Date--Manip--TZ--pafaka00 \
perl-Date--Manip--TZ--pafiji00 \
perl-Date--Manip--TZ--pagala00 \
perl-Date--Manip--TZ--pagamb00 \
perl-Date--Manip--TZ--paguad00 \
perl-Date--Manip--TZ--paguam00 \
perl-Date--Manip--TZ--pahono00 \
perl-Date--Manip--TZ--pakant00 \
perl-Date--Manip--TZ--pakiri00 \
perl-Date--Manip--TZ--pakosr00 \
perl-Date--Manip--TZ--pakwaj00 \
perl-Date--Manip--TZ--pamarq00 \
perl-Date--Manip--TZ--panaur00 \
perl-Date--Manip--TZ--paniue00 \
perl-Date--Manip--TZ--panorf00 \
perl-Date--Manip--TZ--panoum00 \
perl-Date--Manip--TZ--papago00 \
perl-Date--Manip--TZ--papala00 \
perl-Date--Manip--TZ--papitc00 \
perl-Date--Manip--TZ--paport00 \
perl-Date--Manip--TZ--pararo00 \
perl-Date--Manip--TZ--patahi00 \
perl-Date--Manip--TZ--patara00 \
perl-Date--Manip--TZ--patong00 \
perl-Date--Manip--TZ--q00 \
perl-Date--Manip--TZ--r00 \
perl-Date--Manip--TZ--s00 \
perl-Date--Manip--TZ--t00 \
perl-Date--Manip--TZ--u00 \
perl-Date--Manip--TZ--ut00 \
perl-Date--Manip--TZ--v00 \
perl-Date--Manip--TZ--w00 \
perl-Date--Manip--TZ--x00 \
perl-Date--Manip--TZ--y00 \
perl-Date--Manip--TZ--z00 \
perl-Date--Manip--TZ-Base \
perl-Date--Manip--TZdata \
perl-Date--Manip--Zones \
perl-Date-Manip"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
