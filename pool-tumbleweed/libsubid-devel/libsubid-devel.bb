SUMMARY = "Development files for libsubid6"
DESCRIPTION = "Development files for libsubid6."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "libsubid-devel-4.20.2-2.1.aarch64.rpm"
RPM_HASH = "ea59aa45a2a7a3fc95696e53bce3786cf1a45b7836c34358c74a0ea9105b9b64f0c6afddbca4258243a7fc8a72e558abf1db430c203bb6ec756f400d3ae2184a"

RPROVIDES:${PN} += "libsubid-devel"

RDEPENDS:${PN} += "libsubid6"

inherit rpm
