SUMMARY = "Udev rules for LimeSDR"
DESCRIPTION = "Udev rules for Lime Suite"
LICENSE = "Apache-2.0"

PV = "23.11.0"

RPM_NAME = "limesuite-udev-23.11.0-4.1.noarch.rpm"
RPM_HASH = "bc62ce0259ff818da31a6b461f5186b8a6374d11b4d04a4c963bd82c7501208e25401573998f5a9e26ca253fa87e918efc605a46f0c547f054ad19c1d6503f44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "limesuite-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
