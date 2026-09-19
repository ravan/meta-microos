SUMMARY = "Freepascal Compiler - sources"
DESCRIPTION = "The fpc-src package contains the sources of Freepascal, for \
documentation or automatical-code generation purposes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-src-3.2.2-5.15.aarch64.rpm"
RPM_HASH = "232309ab66d818f7872daf4b548e2cc00f30b9dcb713ed6ffae328c3a797195539839659ec402f73e582115691f44adb4b714b9a707b760c34145df395504f8c"

RPROVIDES:${PN} += "fpc-src"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/csh \
/usr/bin/env \
/usr/bin/sh"

inherit rpm
