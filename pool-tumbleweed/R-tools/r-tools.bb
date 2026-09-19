SUMMARY = "Package providing R-tools"
DESCRIPTION = "This package provides R-tools, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-tools-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "a13aee21f1b131fd98df871067b210919dadd027859eff18ad37f126daa0f896a574f1312ac2d2268192a35f2c4ca8fe8cdbaf156c7d04eda65ab38a286864a3"

RPROVIDES:${PN} += "R-tools"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
