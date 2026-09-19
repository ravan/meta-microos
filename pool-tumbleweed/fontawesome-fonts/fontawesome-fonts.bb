SUMMARY = "Iconic font set"
DESCRIPTION = "Scalable vector icons that can be customized — size, color, drop shadow, \
and anything that can be done with the power of CSS. \
 \
(Note that the font does not contain regular letters, and that icons \
are in the range U+F000..U+F23A.)"
LICENSE = "OFL-1.1"

PV = "7.3.1"

RPM_NAME = "fontawesome-fonts-7.3.1-1.1.noarch.rpm"
RPM_HASH = "e783ad4c09bfe27b2870fc4d8d510e09e0ca2ee22e0f5b8777f1f38cfe44e1d2cd9dabb8a18b350e537bdada5f50657230b541b7c49dcf88e1ebbfb391c6aa56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontawesome-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
