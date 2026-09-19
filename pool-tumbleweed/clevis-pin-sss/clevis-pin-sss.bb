SUMMARY = "SSS pin integration for Clevis"
DESCRIPTION = "Support for the Shamir Secret Service algorithm as a way to mix pins together to provide sophisticated unlocking policies."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-pin-sss-21-1.6.aarch64.rpm"
RPM_HASH = "977185678765f3065fa011dbf02c28a1a928638e6ebd456be9f0f896287fbec661fcb5d410dfb5fd551cbf538f2fd3a7671373db3325f4389526a4742389d70e"

RPROVIDES:${PN} += "clevis-pin-sss"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjansson.so.4 \
libjose.so.0"

inherit rpm
