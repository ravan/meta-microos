SUMMARY = "Development files for futuresql"
DESCRIPTION = "This package contains development files needed to use futuresql."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "futuresql-qt5-devel-0.1.1-1.10.aarch64.rpm"
RPM_HASH = "47c498bfc2e44cbbebe3639387b2a4cc6cba04599a41ce35530cae86d125616df412ffe2908e6a040368b2419c8cd42d686cc973501027e471582e7a920f31a5"

RPROVIDES:${PN} += "cmake-FutureSQL5 \
futuresql-qt5-devel"

RDEPENDS:${PN} += "libfuturesql5-0"

inherit rpm
