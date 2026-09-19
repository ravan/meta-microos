SUMMARY = "Kana kanji simple inversion library"
DESCRIPTION = "jaconv (Japanese Converter) is interconverter for Hiragana, \
Katakana, Hankaku (half-width character) and Zenkaku (full-width character)"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-jaconv-0.5.0-1.2.noarch.rpm"
RPM_HASH = "771ee914cd4cd6e0451a69b38d5b74050b59d1038df6eb4e77949c0d841b21ead2fc9b5fe0ec982952729458af3614526c60b06dad8eabc06615cc3104502ff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaconv \
python3.13dist-jaconv \
python313-jaconv \
python3dist-jaconv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
