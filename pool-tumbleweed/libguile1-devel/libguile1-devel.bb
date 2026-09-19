SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the files necessary to link against the guile libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile1-devel-1.8.8-25.5.aarch64.rpm"
RPM_HASH = "413534892edd54f5adab7e445fde8cc208675230a9d13072e5dd7a0816c74c79e9b9acb79c8b168ce058e827f9af95f8bc501a8116f36024e6d47046742b8a9e"

RPROVIDES:${PN} += "libguile1-devel \
pkgconfig-guile-1.8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
guile1 \
libguile-srfi-srfi-1-v-3-3 \
libguile-srfi-srfi-13-14-v-3-3 \
libguile-srfi-srfi-4-v-3-3 \
libguile-srfi-srfi-60-v-2-2 \
libguile17 \
libguilereadline-v-17-17 \
libltdl-devel \
ncurses-devel \
readline-devel"

inherit rpm
