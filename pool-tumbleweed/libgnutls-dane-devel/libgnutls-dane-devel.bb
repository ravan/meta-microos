SUMMARY = "Development package for GnuTLS DANE component"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.13"

RPM_NAME = "libgnutls-dane-devel-3.8.13-3.1.aarch64.rpm"
RPM_HASH = "9a6fd33658d75b65a0ccda3fffee2f04dd2c2abcb5005ce7d5874b140c458a4356da486d3fc55929a2d0a6eec6577fcd4cf451ff7ffdfcb5b863dabe82563985"

RPROVIDES:${PN} += "libgnutls-dane-devel \
pkgconfig-gnutls-dane"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnutls-dane0 \
pkgconfig-gnutls"

inherit rpm
