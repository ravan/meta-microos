SUMMARY = "Encoder and decoder of the ITU G.729 Annex A/B speech codec"
DESCRIPTION = "Bcg729 is an implementation of both encoder and decoder of the ITU \
G.729 Annex A/B speech codec. It supports concurrent channels \
encoding/decoding for multi call application such as conferencing."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "libbcg729-0-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "f81fb24f9a3645ddd2182e4e7f1abc9dbd21a5fb37244da085a609378e4c5f41768d7a6d755e2b6fafc0f050a5945b0d358994f45b949bab217d9f32f5282c99"

RPROVIDES:${PN} += "libbcg729-0 \
libbcg729.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
