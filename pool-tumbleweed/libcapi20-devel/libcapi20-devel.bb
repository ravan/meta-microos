SUMMARY = "Header files for the Common ISDN API library"
DESCRIPTION = "This package provides files needed for development of CAPI-aware \
software."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-devel-3.27-2.19.aarch64.rpm"
RPM_HASH = "a90de4cb33bf2557b9f24af3b3b2afe2fb0ef097a493efd004ce2b1737869375c72f5e5f7683a60eb47581afc0ca0c1da606a04175829a3f2ef125b78e4a61a5"

RPROVIDES:${PN} += "capi4linux-devel \
libcapi20-devel \
pkgconfig-capi20"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcapi20-3"

inherit rpm
