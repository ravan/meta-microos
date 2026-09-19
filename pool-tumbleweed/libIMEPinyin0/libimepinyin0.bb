SUMMARY = "Pinyin library for libime"
DESCRIPTION = "This package provides pinyin library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.13"

RPM_NAME = "libIMEPinyin0-1.1.13-1.5.aarch64.rpm"
RPM_HASH = "7a1dbaa33837e0f55fd73190eb26e557f96413810b39bb41318379be142ae87aada803403e05dbbadad09526b49685ca3f901bfd21d81bda75ac34405e3b9fe4"

RPROVIDES:${PN} += "libIMEPinyin.so.0 \
libIMEPinyin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libime-dicts \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
