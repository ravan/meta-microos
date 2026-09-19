SUMMARY = "Development files for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the headers for ICU."
LICENSE = "Unicode-3.0"

PV = "78.3"

RPM_NAME = "libicu-devel-78.3-1.3.aarch64.rpm"
RPM_HASH = "5935c01fe21b8806b4aa1e93d1ebbfa2aee0870a346ebd7e10b9e08975c105030601eec45446598b32abb59eac3853e2b9a5eabeacfce2e5d60169162b59e6a9"

RPROVIDES:${PN} += "libicu-devel \
pkgconfig-icu-i18n \
pkgconfig-icu-io \
pkgconfig-icu-uc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libicu78 \
pkgconfig-icu-i18n \
pkgconfig-icu-uc"

inherit rpm
