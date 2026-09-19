SUMMARY = "Detector for confusable use of Unicode homoglyphs"
DESCRIPTION = "A Python module to detect Unicode homoglyphs and homograph attacks. \
Homoglyphs are characters that may appear the same but have different \
codepoints, meaning or representation, for example U+0041 LATIN \
CAPITAL LETTER A ('A') vs. U+0391 GREEK CAPITAL LETTER ALPHA, 'Α'."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python313-confusable-homoglyphs-3.3.1-4.5.noarch.rpm"
RPM_HASH = "79cebc826653b39eec30bd1a398d26d5991e1eff1520c047569354c3a19f149101522435583cb7f4348044c29e7175c642be05668b34ed22f5304393ac33690d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-confusable-homoglyphs \
python3.13dist-confusable-homoglyphs \
python313-confusable-homoglyphs \
python3dist-confusable-homoglyphs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click"

inherit rpm
