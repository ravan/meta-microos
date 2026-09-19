SUMMARY = "Development files for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libipa_hbac-devel-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "35edb210f2b1564a936e5c6f691f6092629798893f99f4d5da97533b5e10010d303b60b363c4bca68ab13c01d0cf5b57c12237cf5040bd24adc425eaed4d8b6d"

RPROVIDES:${PN} += "libipa-hbac-devel \
pkgconfig-ipa-hbac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipa-hbac0"

inherit rpm
