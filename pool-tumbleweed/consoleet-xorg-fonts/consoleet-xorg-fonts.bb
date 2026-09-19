SUMMARY = "Vector/OTF remakes of Xorg fonts"
DESCRIPTION = "Vector remakes of the Xorg 'Misc Fixed' fonts (8x13, 9x15, 10x20) and \
'Sony Fixed' (12x24)."
LICENSE = "CC-BY-SA-4.0"

PV = "7.6.1"

RPM_NAME = "consoleet-xorg-fonts-7.6.1-1.9.noarch.rpm"
RPM_HASH = "bfd520f7ec5f20c2fd53d6d7061e42a87b17c9955b84d441a894eb0bf8abed9e4a71ed65cd1c06acf722e6e49cf54711d144c75d164df305a3c825366778817e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-xorg-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
