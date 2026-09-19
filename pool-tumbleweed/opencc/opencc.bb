SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "opencc-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "b78a7b535586a91d1398632028cdd76c433798b51d8b2cfadfc15eb0ebf156ed5a445870a5b2e7b9c3a60002d020db36cf2b4965198434ae3048d758c09a1277"

RPROVIDES:${PN} += "opencc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopencc.so.1.2 \
libstdc++.so.6"

inherit rpm
