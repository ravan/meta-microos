SUMMARY = "Library for working with Universal Disk Format filesystems"
DESCRIPTION = "This library is made to read and write UDF filesystems, which are mainly \
used on DVDs."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "libudf0-2.2.0-1.7.aarch64.rpm"
RPM_HASH = "15a03eec1cdfc3873b3b9b1c719fe530c3ddf6379a4cf82c4395c59b5e1e9b7d0b764ec8ca0df92a9ec1d81afe254048f8cbd315ea0e730a8ef57ea072559e46"

RPROVIDES:${PN} += "libudf.so.0 \
libudf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19"

inherit rpm
