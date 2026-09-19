SUMMARY = "Library to access Blu-Ray disks - Development files"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libbluray-devel-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "2e757827586e13897c09d2f94f21d2801206b0ac08680526d51dae4af5e75f2ee256cb425a050024f9440773b96d263f9e8c6ac639a7b259961a4964022f83d6"

RPROVIDES:${PN} += "libbluray-devel \
pkgconfig-libbluray"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluray3 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-libudfread \
pkgconfig-libxml-2.0"

inherit rpm
