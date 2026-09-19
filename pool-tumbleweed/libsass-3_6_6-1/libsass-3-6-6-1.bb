SUMMARY = "Compiler library for A CSS preprocessor language"
DESCRIPTION = "This package provides the shared library object for libsass."
LICENSE = "MIT"

PV = "3.6.6"

RPM_NAME = "libsass-3_6_6-1-3.6.6-1.9.aarch64.rpm"
RPM_HASH = "df8ed1e9214ded9ded464e2088b23ea99d4f74351a2aaa05d66ce584e887d55d522a7a4d34443322b6aedbf0269df6a1793c654168d4cbd0b67a5dac02e55a69"

RPROVIDES:${PN} += "libsass-3-6-6-1 \
libsass-3.6.6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
