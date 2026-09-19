SUMMARY = "A library to control input modules on the Framework 16 Laptop"
DESCRIPTION = "A library to control input modules on the Framework 16 Laptop"
LICENSE = "MIT"

PV = "0.2.0+git49"

RPM_NAME = "python314-framework16_inputmodule-0.2.0+git49-2.6.noarch.rpm"
RPM_HASH = "d407990bef17ea7a161cf2d165f3768dac59521b2cc1b64f487ee9dd9fb44a60059329a31a99bfc8ccaac3c3395644815a00431b4ab797edacd6473fafff64f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-inputmodule \
python314-framework16-inputmodule \
python3dist-inputmodule"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
framework-inputmodule-control \
python-abi \
python314-Pillow \
python314-base \
python314-getkey \
python314-pygame \
python314-pyserial \
python314-tk"

inherit rpm
