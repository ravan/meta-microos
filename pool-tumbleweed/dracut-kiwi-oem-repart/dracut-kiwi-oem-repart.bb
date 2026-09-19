SUMMARY = "KIWI - Dracut module for oem(repart) image type"
DESCRIPTION = "This package contains the kiwi-repart dracut module which is \
used to repartition the oem disk image to the current disk \
geometry according to the setup in the kiwi image configuration"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "dracut-kiwi-oem-repart-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "c932ba9467caead43e673c150e9d4c509c0d08ba74327a6364e5070cd013dab34de9cae729c677941c1964172952a0254e310b4684903a84fa6e64926c1463c4"

RPROVIDES:${PN} += "dracut-kiwi-oem-repart"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut-kiwi-lib"

inherit rpm
