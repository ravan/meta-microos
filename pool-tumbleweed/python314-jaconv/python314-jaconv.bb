SUMMARY = "Kana kanji simple inversion library"
DESCRIPTION = "jaconv (Japanese Converter) is interconverter for Hiragana, \
Katakana, Hankaku (half-width character) and Zenkaku (full-width character)"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-jaconv-0.5.0-1.2.noarch.rpm"
RPM_HASH = "1942ec0b81f27b58a42cf2f090c6e9281ad5bae13d3beee23532f7897b8321cae9837fb08586f600d7501b6f2f0f377ffc4e177435a67059c16a716242b4b436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaconv \
python314-jaconv \
python3dist-jaconv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
