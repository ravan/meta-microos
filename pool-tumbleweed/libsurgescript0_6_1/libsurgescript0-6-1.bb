SUMMARY = "Files for developing applications using surgescript"
DESCRIPTION = "This package contains files required for \
developing applications using surgescript."
LICENSE = "Apache-2.0 & BSD-1-Clause & BSD-2-Clause & SUSE-Public-Domain"

PV = "0.6.1"

RPM_NAME = "libsurgescript0_6_1-0.6.1-2.6.aarch64.rpm"
RPM_HASH = "3365d32bdb220c0a24932134e9454b2f123f8eda107e8e1f991bf6e80b0b4e8e0330f2834790f77c07c9e42fca3e53feca75ad7139d17281daeaab6baa9f7318"

RPROVIDES:${PN} += "libsurgescript.so.0.6.1 \
libsurgescript0-6-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
