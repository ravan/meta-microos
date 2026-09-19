SUMMARY = "C++ interface for pango -- Development Files"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.46.5"

RPM_NAME = "pangomm1_4-devel-2.46.5-1.3.aarch64.rpm"
RPM_HASH = "e97c32d265ef327af4f5ceb7b2e850c3b0cc64ae8895204be22663aad2086498079e3eb392fb798aa8cf3787996bc1a97256f1d310c625a0455a306ab2407f22"

RPROVIDES:${PN} += "pangomm1-4-devel \
pkgconfig-pangomm-1.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpangomm-1-4-1 \
pkgconfig-cairomm-1.0 \
pkgconfig-glibmm-2.4 \
pkgconfig-pangocairo"

inherit rpm
