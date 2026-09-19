SUMMARY = "C library for the subunit testing protocol"
DESCRIPTION = "Subunit C bindings.  See the python-subunit package for test processing \
functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "subunit-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "505931d92f23916aacf7f183584142e2aa7a5393ae032f45cd0c1f393e1af764f64eacd1774c6dff4ced17e76270136ea219722c131b6df3c896981c68634082"

RPROVIDES:${PN} += "subunit"

RDEPENDS:${PN} += ""

inherit rpm
