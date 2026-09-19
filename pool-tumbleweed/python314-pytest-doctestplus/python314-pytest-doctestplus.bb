SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of various text files, such \
as reStructuredText ('.rst'), markdown ('.md'), and TeX ('.tex')."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python314-pytest-doctestplus-1.7.1-1.4.noarch.rpm"
RPM_HASH = "990ceb252a739937f2f34eb11f037549233b39cf88f2621ed5b191d5e68cdd3442bfa829c5e16d3bca8e9ce2605a78103e20ab5000e89665959b89b87be41e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-doctestplus \
python314-pytest-doctestplus \
python3dist-pytest-doctestplus"

RDEPENDS:${PN} += "python-abi \
python314-packaging \
python314-pytest"

inherit rpm
