SUMMARY = "Arabic Bitmap Font"
DESCRIPTION = "Misc Fixed family with arabic symbols."
LICENSE = "SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "arabic-bitmap-fonts-1.0-18.23.noarch.rpm"
RPM_HASH = "58d3417aae768fdb3cf5c903c64dc72f6f0ec984fd8ebe70f888299fd0b611c224eb207a3834af411b98888a56be0d14e22a41e5c431eaad1cd89e40b9aebc2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-bitmap-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
