SUMMARY = "Development Environment for libigloo"
DESCRIPTION = "This package contains the include-files and static libraries for libigloo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.5"

RPM_NAME = "libigloo-devel-0.9.5-1.3.aarch64.rpm"
RPM_HASH = "77c2345f7e4db2655cac416c2f1f33fb89c6d47b3c6e8ef67d4e6547866fc86d4aade440435d20ae58e5956583c9aaab6bd7be478f69449e4d6ec3cfd69ee4dd"

RPROVIDES:${PN} += "libigloo-devel \
pkgconfig-igloo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libigloo0"

inherit rpm
