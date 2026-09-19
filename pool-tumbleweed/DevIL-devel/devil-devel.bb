SUMMARY = "Header files for Developers Image Library"
DESCRIPTION = "Developer's Image Library (DevIL) is a programmer's library to develop \
applications with image loading capabilities. \
 \
This package contains the development libraries and headers."
LICENSE = "LGPL-2.1-only"

PV = "1.7.8"

RPM_NAME = "DevIL-devel-1.7.8-12.13.aarch64.rpm"
RPM_HASH = "39310265277ffc67537389abf83debf99143ab90b05535675975a7fc0519cc08cf34c8a7e406daf666e01052031f5097b7c048d04749b52a57190a458ced8b0d"

RPROVIDES:${PN} += "DevIL-devel \
libdevil-devel \
pkgconfig-IL \
pkgconfig-ILU \
pkgconfig-ILUT"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libIL1 \
pkgconfig-IL"

inherit rpm
