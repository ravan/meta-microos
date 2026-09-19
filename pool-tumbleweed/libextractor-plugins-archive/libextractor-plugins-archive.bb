SUMMARY = "The 'archive' libextractor plugin"
DESCRIPTION = "This package ships the 'archive' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-archive-1.14-1.2.aarch64.rpm"
RPM_HASH = "157a2ba340aa87fc08c0992b958a8760fe060c48fae182d2b4eb1e5c9eb8e7f589a8a07d504a9a79d7154f5287766ead7881688e9d472315be52f9510c354468"

RPROVIDES:${PN} += "libextractor-archive.so \
libextractor-plugins-archive"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6"

inherit rpm
