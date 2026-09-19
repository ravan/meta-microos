SUMMARY = "Development package for the GnuTLS C API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.13"

RPM_NAME = "libgnutls-devel-3.8.13-3.1.aarch64.rpm"
RPM_HASH = "84c0d80190f7898445299d24f6c6f84c77a83d5d8a076b76763b4a858ef95511b2c36c9ec0d7cc39aaaeb13de41196058d53500cae2bd5e99cec9c88423b9a41"

RPROVIDES:${PN} += "gnutls-devel \
libgnutls-devel \
pkgconfig-gnutls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
crypto-policies \
glibc-devel \
gnutls \
libgnutls30 \
pkgconfig-hogweed \
pkgconfig-leancrypto \
pkgconfig-libidn2 \
pkgconfig-libtasn1 \
pkgconfig-nettle \
pkgconfig-p11-kit-1"

inherit rpm
