SUMMARY = "A linter for YAML files"
DESCRIPTION = "A linter for YAML files. \
 \
YAMLlint does not only check for syntax validity, but for weirdnesses like key \
repetition and cosmetic problems such as lines length, trailing spaces, \
indentation, etc."
LICENSE = "GPL-3.0-only"

PV = "1.38.0"

RPM_NAME = "python314-yamllint-1.38.0-1.4.noarch.rpm"
RPM_HASH = "552512960d7862c30f9f3d9fd4e6dfad12a0ebab7599b45f8f2179aff98066f8938630353c7e95066081d1948328d2b496c3e72f08c494d5a702f842b4793b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yamllint \
python314-yamllint \
python3dist-yamllint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-pathspec"

inherit rpm
