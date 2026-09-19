SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "46a323353d4858fe5855889aafc37bb018f37e09636ba3d2c249c87f0d550c08a91296c8013d8f3101797702f9466a263fbc541d081002abadeebfc31acf4909"

RPROVIDES:${PN} += "arm-suse-linux-gnueabi-gcc \
cross-arm-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
