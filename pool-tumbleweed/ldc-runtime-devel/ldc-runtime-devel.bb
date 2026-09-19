SUMMARY = "Development files for the D runtime library"
DESCRIPTION = "This package contains the druntime development files necessary for developing \
with LDC."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.42.0"

RPM_NAME = "ldc-runtime-devel-1.42.0-1.3.aarch64.rpm"
RPM_HASH = "5f8e3d9dad5a878af73351a0d61771c57ea77e657717922e8ae74fe3c25d63005ed4455f487d447b68854a917b9bb34a2c17d8cf3cd86105a8e5a38b94cf604c"

RPROVIDES:${PN} += "ldc-runtime-devel"

RDEPENDS:${PN} += "libdruntime-ldc112"

inherit rpm
