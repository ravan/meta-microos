SUMMARY = "Spell checker library and tool based on HFST"
DESCRIPTION = "Minimal HFST optimized lookup format based spell checker library and \
a demonstrational implementation of command line based spell checker."
LICENSE = "Apache-2.0"

PV = "0.5.4"

RPM_NAME = "hfst-ospell-0.5.4-1.12.aarch64.rpm"
RPM_HASH = "472829e51b804483db5e6138f99e492be3adc0ba06c949e27f1d35c884f7b7f07addf1ce5edbc21d3bf2360900c008f9281302ee6c25b8a6bf0e8df5038c81b1"

RPROVIDES:${PN} += "hfst-ospell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhfstospell.so.11 \
libicuuc.so.78 \
libstdc++.so.6"

inherit rpm
