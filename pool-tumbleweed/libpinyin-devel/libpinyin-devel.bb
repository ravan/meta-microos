SUMMARY = "Development files for the libpinyin IME"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This subpackage contains the development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.3"

RPM_NAME = "libpinyin-devel-2.10.3-1.7.aarch64.rpm"
RPM_HASH = "bf43f717e4ce3bfded293ed0d8620a078ac17f71449f65dc7a8696eeb1afd0dd75813b0fba57330a102d13e0021c5ffa6fd840f5b4399e426a959dc7a6761124"

RPROVIDES:${PN} += "libpinyin-devel \
libzhuyin-devel \
pkgconfig-libpinyin \
pkgconfig-libzhuyin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpinyin-tools \
libpinyin15 \
libzhuyin15 \
pkgconfig-glib-2.0"

inherit rpm
