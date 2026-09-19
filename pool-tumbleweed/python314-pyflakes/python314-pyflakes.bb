SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python314-pyflakes-3.4.0-2.5.noarch.rpm"
RPM_HASH = "06bfae47ddc2751612eb200f127f10035b8c24eaf2a59ed4741818e110c709f4f933bad30f55631cd01e18489d668c5714cb5f1c9ec9b2a30f638e96c48c6d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyflakes \
python314-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
