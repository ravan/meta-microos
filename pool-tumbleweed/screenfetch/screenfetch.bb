SUMMARY = "Fetches system/theme information in terminal for Linux desktop screenshots"
DESCRIPTION = "screenFetch is a 'Bash Screenshot Information Tool'. This handy Bash \
script can be used to generate one of those nifty terminal theme \
information + ASCII distribution logos you see in everyone's screenshots \
nowadays. It will auto-detect your distribution and display an ASCII \
version of that distribution's logo and some valuable information to the \
right. There are options to specify no ascii art, colors, taking a \
screenshot upon displaying info, and even customizing the screenshot \
command! This script is very easy to add to and can be easily extended."
LICENSE = "GPL-3.0-only"

PV = "3.9.9"

RPM_NAME = "screenfetch-3.9.9-1.5.noarch.rpm"
RPM_HASH = "0176b081e418ec0dd24bf1eddee345de63a544da217172095ba3a5e48fff8dd43f44e65254a3db0b2c94c78a38029edc474d071a95a597adeb124e4c7cb8bd27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "screenfetch"

RDEPENDS:${PN} += "/usr/bin/bash \
bc \
xprop"

inherit rpm
