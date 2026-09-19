SUMMARY = "Header files for libuEv"
DESCRIPTION = "Development and header files for libuEv."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libuev-devel-2.4.1-2.11.aarch64.rpm"
RPM_HASH = "543d437cd3636548a6f128f9a517385c0314448db440efe29861b9938a4d0531f6a764165f1104ff24d5327040bef803de69d1defdffc075df116385f64d2de5"

RPROVIDES:${PN} += "libuev-devel \
pkgconfig-libuev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuev3"

inherit rpm
