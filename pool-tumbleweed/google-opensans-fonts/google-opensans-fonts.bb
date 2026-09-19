SUMMARY = "Humanist Sans Serif Typeface"
DESCRIPTION = "Open Sans is a humanist sans serif typeface designed by \
Steve Matteson, Type Director of Ascender Corp. \
 \
This version contains the complete 897 character set, which \
includes the standard ISO Latin 1, Latin CE, Greek and Cyrillic \
character sets. Open Sans was designed with an upright stress, \
open forms and a neutral, yet friendly appearance. It was \
optimized for print, web, and mobile interfaces, and has \
excellent legibility characteristics in its letterforms. \
 \
Designer: Steve Matteson"
LICENSE = "OFL-1.1"

PV = "20210927"

RPM_NAME = "google-opensans-fonts-20210927-1.10.noarch.rpm"
RPM_HASH = "8f50f73a9f77da252664907987cecf8082a730b6af926230f6266f3119135d3169e68a3f7d94685d5effe94662740eedfa9aec67cfb740c9f8b2eea412060de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-opensans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
