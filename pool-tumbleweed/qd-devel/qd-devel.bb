SUMMARY = "Development files for qd"
DESCRIPTION = "The qd-devel package contains libraries and header files for \
developing applications that use qd."
LICENSE = "BSD-3-Clause-LBNL"

PV = "2.3.24"

RPM_NAME = "qd-devel-2.3.24-1.9.aarch64.rpm"
RPM_HASH = "686d7f1ac08c49c162b8849189bea07aec7bdb0c398264314fc34343635ba2fb4b51df53bd85e247b1ee92f7ecb48c6c065c5131d22370b8834882d1f57d5d22"

RPROVIDES:${PN} += "pkgconfig-qd \
qd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libqd0"

inherit rpm
