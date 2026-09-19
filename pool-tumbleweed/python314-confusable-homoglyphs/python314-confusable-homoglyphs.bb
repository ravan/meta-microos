SUMMARY = "Detector for confusable use of Unicode homoglyphs"
DESCRIPTION = "A Python module to detect Unicode homoglyphs and homograph attacks. \
Homoglyphs are characters that may appear the same but have different \
codepoints, meaning or representation, for example U+0041 LATIN \
CAPITAL LETTER A ('A') vs. U+0391 GREEK CAPITAL LETTER ALPHA, 'Α'."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python314-confusable-homoglyphs-3.3.1-4.5.noarch.rpm"
RPM_HASH = "e5d527017a37366e5748c5f80a2918c5f714f4ef47d1198257d3b7e8148c4067a0ff87689ad75de217b3bdf96e4fa3b4109d02e3de1af4b5618d81c6abbb6fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-confusable-homoglyphs \
python314-confusable-homoglyphs \
python3dist-confusable-homoglyphs"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click"

inherit rpm
