SUMMARY = "Devel files for composefs"
DESCRIPTION = "Devel files for composefs."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "composefs-devel-1.0.8-3.11.aarch64.rpm"
RPM_HASH = "097ab1105c56bed66e4340428968eb8b94a71937996e10864e1d5ee1838eb581e250ed7deb8ae9983eab0c56f1ab826359c3a889ec9921a4e5deb06d84e6b976"

RPROVIDES:${PN} += "composefs-devel \
pkgconfig-composefs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
composefs \
libcomposefs1 \
pkgconfig-libcrypto"

inherit rpm
