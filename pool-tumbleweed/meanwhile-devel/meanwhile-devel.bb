SUMMARY = "IBM Sametime Community Client library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "meanwhile-devel-1.1.1-2.10.aarch64.rpm"
RPM_HASH = "51e9a9056611885d5cbe989762e6e1ddd122b51b10bfdf0d289b46f51edc25348f00fbf93134d4d72dfb1e5619a861f6f5807873eb10d8105bcfedd00dc54ae3"

RPROVIDES:${PN} += "meanwhile-devel \
pkgconfig-meanwhile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmeanwhile1 \
pkgconfig-glib-2.0"

inherit rpm
