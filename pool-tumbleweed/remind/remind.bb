SUMMARY = "A sophisticated calendar and alarm program"
DESCRIPTION = "Remind is a sophisticated calendar and alarm program. \
It includes the following features: \
 \
* A sophisticated scripting language and intelligent \
  handling of exceptions and holidays. \
* Plain-text, PostScript and HTML output. \
* Timed reminders and pop-up alarms. \
* A friendly graphical front-end for people who don't \
  want to learn the scripting language. \
* Facilities for both the Gregorian and Hebrew calendars. \
* Support for 12 different languages."
LICENSE = "GPL-2.0-only"

PV = "6.3.2"

RPM_NAME = "remind-6.3.2-1.1.aarch64.rpm"
RPM_HASH = "936266f43c8ddde020a85e640c69f755a12c84442703d9d023d9154ea831eca6055e778f2394b552dbd882925d92a019b4d0009de42d859098a81d36328ba030"

RPROVIDES:${PN} += "perl-Remind--PDF \
perl-Remind--PDF--Entry \
perl-Remind--PDF--Entry--UNKNOWN \
perl-Remind--PDF--Entry--color \
perl-Remind--PDF--Entry--formatted \
perl-Remind--PDF--Entry--html \
perl-Remind--PDF--Entry--htmlclass \
perl-Remind--PDF--Entry--moon \
perl-Remind--PDF--Entry--pango \
perl-Remind--PDF--Entry--postscript \
perl-Remind--PDF--Entry--psfile \
perl-Remind--PDF--Entry--shade \
perl-Remind--PDF--Entry--week \
perl-Remind--PDF--Multi \
perl-Remind--PDF--Weekly \
remind"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
perl \
perl-Cairo \
perl-Getopt-Long-Descriptive \
perl-JSON-Any \
perl-Pango \
tcllib"

inherit rpm
