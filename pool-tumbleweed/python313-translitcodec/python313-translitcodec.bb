SUMMARY = "Unicode to 8-bit charset transliteration codec"
DESCRIPTION = "This package contains codecs for transliterating ISO 10646 texts into \
best-effort representations using smaller coded character sets (ASCII, \
ISO 8859, etc.).  The translation tables used by the codecs are from \
the ``transtab`` collection by Markus Kuhn."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python313-translitcodec-0.7.0-2.5.noarch.rpm"
RPM_HASH = "edeb1ea3110eeff099e7d4ffc986a3c95c7f7b409856673a822cb28b3d1d88af15a9310bf16502c3ca4f86c2962cd385b7cf4a0c67e65bc060a416fa2fb49eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translitcodec \
python3.13dist-translitcodec \
python313-translitcodec \
python3dist-translitcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
