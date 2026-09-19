SUMMARY = "Thumbnailer for WebP images"
DESCRIPTION = "A thumbnailer for WebP images"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "tumbler-webp-thumbnailer-4.20.2-1.1.noarch.rpm"
RPM_HASH = "35dc9f0c1d8d9bc5dd6c804e4ba3d7f07e21757789c8784ac6da81929880e14008ea3532473272438430f6d874dc7a8aa7c412d14ea65a96dd13a2c668ee5581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tumbler-webp-thumbnailer"

RDEPENDS:${PN} += "/usr/bin/bash \
ImageMagick \
libwebp-tools"

inherit rpm
