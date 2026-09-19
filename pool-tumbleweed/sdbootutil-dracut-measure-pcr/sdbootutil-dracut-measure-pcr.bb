SUMMARY = "Dracut module to measure PCR 15"
DESCRIPTION = "Dracut module from sdbootutil to measure PCR 15 in non-UKIs systems"
LICENSE = "MIT"

PV = "1+git20260909.7cfa1f0"

RPM_NAME = "sdbootutil-dracut-measure-pcr-1+git20260909.7cfa1f0-1.1.noarch.rpm"
RPM_HASH = "c38ce9a110422cf9cf9283355332e5f0e16ba63317167bb0c6b049b22027e44a9ad91fd6c4196a5321af309ed0e27a8b81c9621ea2bfebf84171396ba28560d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbootutil-dracut-measure-pcr"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
