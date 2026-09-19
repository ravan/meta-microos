SUMMARY = "Motif Include Files and Libraries Mandatory for Development"
DESCRIPTION = "This package provies the include files and libraries necessary for developing \
Motif applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "motif-devel-2.3.8-4.7.aarch64.rpm"
RPM_HASH = "f002ac3e03011b2e7dd5d3107538c2caed7d84a86335a0a38b463aea9b6ddaae6395e7545e50f52cfc9107a0e83d63946ccb745bb865ffd1170ecbfebfc889bd"

RPROVIDES:${PN} += "motif-devel \
openmotif-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMrm.so.4 \
libMrm4 \
libUil4 \
libXm.so.4 \
libXm4 \
libXt.so.6 \
libc.so.6 \
pkgconfig-printproto \
pkgconfig-x11 \
pkgconfig-xft \
pkgconfig-xproto \
pkgconfig-xt"

inherit rpm
