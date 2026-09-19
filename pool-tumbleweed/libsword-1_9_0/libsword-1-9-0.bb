SUMMARY = "Shared library for sword"
DESCRIPTION = "This package contains the shared library for applications using sword."
LICENSE = "Apache-2.0 & GPL-2.0-only"

PV = "1.9.0"

RPM_NAME = "libsword-1_9_0-1.9.0-2.1.aarch64.rpm"
RPM_HASH = "ecde3bd6bf4ae93523a3ba527838c0e86b0dd4c0f887f3fca9203d44d0efa2affed6adf7099746d03a157ac8edd7b2fef301ffa4ce2bb9eba944063ec0da7af2"

RPROVIDES:${PN} += "libsword-1-9-0 \
libsword-1.9.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclucene-core.so.1 \
libcurl.so.4 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
