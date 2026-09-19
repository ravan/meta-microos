SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "schroedinger-devel-1.0.11-11.28.aarch64.rpm"
RPM_HASH = "fe730f29ae460e122dda0fc0b12c69cc413a65181b43cf98fa8f86dff34a85d439d286e353bfd820d725bcfd71d5433a6e1f823b638a6406dca5163d7e6266a9"

RPROVIDES:${PN} += "libschroedinger-devel \
pkgconfig-schroedinger-1.0 \
schroedinger-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libschroedinger-1-0-0 \
orc \
pkgconfig-orc-0.4"

inherit rpm
