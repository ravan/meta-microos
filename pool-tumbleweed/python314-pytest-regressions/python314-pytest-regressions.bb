SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python314-pytest-regressions-2.10.0-1.2.noarch.rpm"
RPM_HASH = "fcc32d39b8c619220e0b2db74b33b7a4d055fa14ef60d67cd2818ab06afea792803e771da98781fe06298365bee8927956bf154bf4e0f9036d0f34849ceef333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-regressions \
python314-pytest-regressions \
python3dist-pytest-regressions"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-pytest \
python314-pytest-datadir"

inherit rpm
