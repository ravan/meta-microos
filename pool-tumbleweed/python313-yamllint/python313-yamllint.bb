SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.38.0"

RPM_NAME = "python313-yamllint-1.38.0-1.4.noarch.rpm"
RPM_HASH = "7b696f0950ccfceb9536ba84fb06ea87eb79217812f2737663621f83415bc825f6403056d8e0ef0b1256a49e82ca48021b1fc1cc71c5cd0e460819c25e2ce2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamllint \
python3.13dist-yamllint \
python313-yamllint \
python3dist-yamllint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-pathspec"

inherit rpm
