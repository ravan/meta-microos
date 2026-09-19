SUMMARY = "Documentation for libctl library"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too. \
 \
This package contains documentation for libctl library."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl-doc-4.5.1-1.18.aarch64.rpm"
RPM_HASH = "5d610cba10d9bf0289bafd34ea290fbb85fbc6b6e27cadab046c31a8ff850967ed1a0c56fce4ef945b6bb8e7adbf2c5d680f8b538623115ec274c61ac5f7c0ae"

RPROVIDES:${PN} += "libctl-doc"

RDEPENDS:${PN} += ""

inherit rpm
