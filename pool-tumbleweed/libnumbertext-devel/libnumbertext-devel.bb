SUMMARY = "Files for Developing with libnumbertext"
DESCRIPTION = "Language-neutral NUMBERTEXT and MONEYTEXT functions for LibreOffice Calc \
 \
This package contains the libnumbertext development files."
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-devel-1.0.11-1.14.aarch64.rpm"
RPM_HASH = "0ce1d67d772c0e8922f0db6ae90f0c7cf451f655b877b25bcacd97c0078931cce820d1d944d68d40a974f79c728aa30d86fd908b61f4dd883bb564663e3d0d44"

RPROVIDES:${PN} += "libnumbertext-devel \
pkgconfig-libnumbertext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnumbertext-1-0-0"

inherit rpm
