SUMMARY = "Header files for the AX.25 library"
DESCRIPTION = "Header files for libax25. Used to build packages that are \
linked against kernel ax25."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-devel-0.0.12~rc5-2.6.aarch64.rpm"
RPM_HASH = "5d7f356de47591fad5072ec6c120d1445fce71ca325056b1c3d782a0e20d127963d2276adb222122a659d385dc17edebdd00a5dbd6c3e42570967e313ddf08f6"

RPROVIDES:${PN} += "libax25-devel"

RDEPENDS:${PN} += "libax25-0 \
libax25io0"

inherit rpm
