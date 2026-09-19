SUMMARY = "Package providing R-stats"
DESCRIPTION = "This package provides R-stats, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-stats-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "def4088f8b18bd4cf62588ecbb314f605756535d782aef03d9e7560c86272d4faac6d3b06de44bd7370af3bd82def0a9c81e1156e482f461e0a1def359ff705d"

RPROVIDES:${PN} += "R-stats"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libRlapack.so \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
