SUMMARY = "Unicode to 8-bit charset transliteration codec"
DESCRIPTION = "This package contains codecs for transliterating ISO 10646 texts into \
best-effort representations using smaller coded character sets (ASCII, \
ISO 8859, etc.).  The translation tables used by the codecs are from \
the ``transtab`` collection by Markus Kuhn."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python314-translitcodec-0.7.0-2.5.noarch.rpm"
RPM_HASH = "b6b2fe0927cf2a85ad6154a75f1860f16780fbe8eddfae5f0bb0670793da51ffd4577a41630fd8e7b5e7b3223f882487b23d3028953fe43b8c75a71fcc272c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-translitcodec \
python314-translitcodec \
python3dist-translitcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
