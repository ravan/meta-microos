SUMMARY = "A set of OpenType fonts designed for user interfaces"
DESCRIPTION = "Source Sans is a set of OpenType fonts that have been designed to work well in user interface (UI) environments, as well as in text setting for screen and print."
LICENSE = "OFL-1.1"

PV = "2.045"

RPM_NAME = "adobe-sourcesanspro-fonts-2.045-2.14.noarch.rpm"
RPM_HASH = "05d41ff3389382791f9d863b309b0a0a4e309268dcc021286f5773f57ac93abcf7a8320e4f670710d750712c752e5363e1804d59eae6c2e7bf211a63248684cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcesanspro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
