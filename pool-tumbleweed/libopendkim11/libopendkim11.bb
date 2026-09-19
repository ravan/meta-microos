SUMMARY = "Library for performing DKIM signing and verification"
DESCRIPTION = "This package provides the shared library libopendkim which \
performs DKIM signing and verification."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "libopendkim11-2.11.0-13.5.aarch64.rpm"
RPM_HASH = "eba5c6017f8c4569657b1e5c91013cf8acb2307f29bc061f9fa586cd7d7be4ca20f1387be18b205d58d0a8b72bacbc9383cd5d3c51144eb5a4d45c752b11cea8"

RPROVIDES:${PN} += "libopendkim.so.11 \
libopendkim11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libtre.so.5"

inherit rpm
