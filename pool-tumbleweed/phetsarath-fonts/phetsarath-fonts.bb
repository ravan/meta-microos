SUMMARY = "Lao Unicode Fonts"
DESCRIPTION = "Phetsarath font family for writing Lao script. Founded by \
Ministry of Posts and Telecommunications, Laos."
LICENSE = "OFL-1.1"

PV = "2.00"

RPM_NAME = "phetsarath-fonts-2.00-4.25.noarch.rpm"
RPM_HASH = "04eedd96b2ea6da618490bc5545699d21d2b65a64b400753fc7011154825d42bd6664fa1090654366704f52806fb1a67b8834ab2992c0cd32413004770c2df0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "phetsarath-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
