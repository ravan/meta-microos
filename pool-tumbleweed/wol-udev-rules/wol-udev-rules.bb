SUMMARY = "Udev rules for activate wol via a magic packet on ethernet devices"
DESCRIPTION = "This package contains the udev rule file for configuring ethernet devices for activate wol via a magic packet."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "wol-udev-rules-0.7.1-165.3.noarch.rpm"
RPM_HASH = "039f0ca02e5fecac82368a23d359e0d4ef3af7ea9272cd5838e112acc70d112116d86f5a84d513a69b8456d1adc8d0b42b623ec682b1bb78423074da4d9739d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wol-udev-rules"

RDEPENDS:${PN} += "ethtool \
udev"

inherit rpm
