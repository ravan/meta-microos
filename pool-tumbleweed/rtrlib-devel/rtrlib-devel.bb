SUMMARY = "Header files for librtr"
DESCRIPTION = "Development and header files for librtr."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "rtrlib-devel-0.8.0-3.5.aarch64.rpm"
RPM_HASH = "8d98517108aa0d942066902352bdd04d707900cbeb879dfede8c5499e606f2af28644acd15a583f8833327470f0ebf8b63824a9fa17ab89339f3715463ca572a"

RPROVIDES:${PN} += "pkgconfig-rtrlib \
rtrlib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librtr0"

inherit rpm
