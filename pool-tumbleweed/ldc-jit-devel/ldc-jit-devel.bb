SUMMARY = "Development files for the D standard library"
DESCRIPTION = "This package contains the LDC jit development files."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.42.0"

RPM_NAME = "ldc-jit-devel-1.42.0-1.3.aarch64.rpm"
RPM_HASH = "a5b578ff3183fd2694548d7ed51e737eb94994f325f6f04d35aabbeb7c226e2259019b701faec01890642ce66601c948a441bf99a39d055a2f5375cb5111129d"

RPROVIDES:${PN} += "ldc-jit-devel"

RDEPENDS:${PN} += "libldc-jit112"

inherit rpm
