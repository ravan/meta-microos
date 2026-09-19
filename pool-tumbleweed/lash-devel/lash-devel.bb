SUMMARY = "Development package for LASH"
DESCRIPTION = "This package contains the development files for the LASH system."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "lash-devel-0.5.4-5.7.aarch64.rpm"
RPM_HASH = "8ff15a635876d1e2b60f3de55c8cda6c090eaf2bdc05bb4532bf6d41e56be309d22cdba22e4291f0ddecc2da5b43ed44a81c2b6c0867d5d8d00d854283d1509b"

RPROVIDES:${PN} += "lash-devel \
pkgconfig-lash-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liblash1 \
libuuid-devel \
pkgconfig-alsa \
pkgconfig-jack \
readline-devel"

inherit rpm
