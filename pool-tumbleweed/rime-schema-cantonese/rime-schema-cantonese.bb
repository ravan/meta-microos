SUMMARY = "Cantonese input schema for rime"
DESCRIPTION = "cantonese(jyutping) input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-cantonese-20250315-1.4.noarch.rpm"
RPM_HASH = "0bed9ab3b6c66c002dea4a8dc19aefd758796d03018f0013238326fb554a7306e583cebd967f1f5710eb5171ea87c9c49cca2487943f50c2a1bbdfd9799f2373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-cantonese \
rime-schema-jyutping"

RDEPENDS:${PN} += ""

inherit rpm
