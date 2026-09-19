SUMMARY = "Shared Object for applications that use civetweb embedded"
DESCRIPTION = "This package contains the shared library required by applications that \
are using civetweb's embeddable API to provide web services."
LICENSE = "MIT"

PV = "1.16+git1776611085.588860e3"

RPM_NAME = "libcivetweb-cpp1_16_0-1.16+git1776611085.588860e3-1.1.aarch64.rpm"
RPM_HASH = "9bf23ecb982799b5092bfaae20713a0f5ee6f20cd7217b4c05214799d0d670a14fc7c31c3e426df60c3be96530ff14cdcc7716754efee0d0133d4d5be2e2a830"

RPROVIDES:${PN} += "libcivetweb-cpp.so.1.16.0 \
libcivetweb-cpp1-16-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcivetweb.so.1.16.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
