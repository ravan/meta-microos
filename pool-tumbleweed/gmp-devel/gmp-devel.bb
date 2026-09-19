SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with \
huge numbers (integer and floating point)."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "gmp-devel-6.3.0-5.6.aarch64.rpm"
RPM_HASH = "d9535f0f3828b36d0e0ea32c94a75db42d7bcc1e6ec79433e82e0e008aef95efccd382ff00c6a1d2a4b4f2454b36bd28b18b095e442edea1d7eaba97c530a644"

RPROVIDES:${PN} += "gmp-devel \
pkgconfig-gmp \
pkgconfig-gmpxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgmp10 \
libgmpxx4 \
pkgconfig-gmp"

inherit rpm
