SUMMARY = "Library for the Alpine package manager"
DESCRIPTION = "Alpine Package Keeper (apk) is a package manager originally built for \
Alpine Linux, but now used by several other distributions as well. \
 \
Library for the Alpine package manager."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "libapk3_0_0-3.0.8-1.1.aarch64.rpm"
RPM_HASH = "584928e0b8f012bf922a7aa2ccc49ec31b0cac12a4c40b51b6ae43d9a2d77d25771983ddbd98ca0ac8941b68ce8e7780f86439b6e6b5bef46804e83ebf21be56"

RPROVIDES:${PN} += "libapk.so.3.0.0 \
libapk3-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1 \
libzstd.so.1"

inherit rpm
