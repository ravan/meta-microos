SUMMARY = "Development files for LAL Frame"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Frame library."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "lalframe-devel-3.0.7-1.5.aarch64.rpm"
RPM_HASH = "76fac6774f5163a6b824d1eb6580beaa1a31f6ee7408c3dcbd8dcdaa7e028cfbcae0c22b3123e093df57ba0fd30fe9c9e95b36d6b65db80188660e3dd6c35d92"

RPROVIDES:${PN} += "config-lalframe-devel \
lalframe-devel \
pkgconfig-lalframe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalframe.so.14 \
liblalframe14 \
liblalsupport.so.14 \
libm.so.6 \
pkgconfig-framecppc \
pkgconfig-framel \
pkgconfig-lal"

inherit rpm
