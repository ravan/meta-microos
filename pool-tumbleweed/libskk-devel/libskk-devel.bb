SUMMARY = "Development Files for libskk"
DESCRIPTION = "SKK is a statistical language model based Japanese input method engine. \
to model the Japanese language, it use a backoff bigram and trigram \
 \
This package provides C/Vala headers for the libskk library."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0+git20180916+1.0.5"

RPM_NAME = "libskk-devel-1.2.0+git20180916+1.0.5-2.7.aarch64.rpm"
RPM_HASH = "31264657380da0f1fdd53ddd67fca2d446b6062040efb2f2883bd15026691f2215c15f7c99fde3426d87433ccc75d99c8806c0278631f645addfec8727a3adb8"

RPROVIDES:${PN} += "libskk-devel \
pkgconfig-libskk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libskk0 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
