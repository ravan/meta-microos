SUMMARY = "SUSE Prime appindicator for switching between GPUs"
DESCRIPTION = "SUSE Prime appindicator for switching between Nvidia/Intel GPUs."
LICENSE = "GPL-2.0-only"

PV = "0.1.0"

RPM_NAME = "suseprime-appindicator-0.1.0-4.4.noarch.rpm"
RPM_HASH = "0d0017d109ac675181c495c50cfe45a6ece805c75381692d35fe0e01e951643b6d459fe06df4ff4092ee384ab251ad959b4155c3fc6d05831c71024cc9873677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-suseprimeindicator \
python3dist-suseprimeindicator \
suseprime-appindicator"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-gobject"

inherit rpm
