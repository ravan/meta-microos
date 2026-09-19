SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of various text files, such \
as reStructuredText ('.rst'), markdown ('.md'), and TeX ('.tex')."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python313-pytest-doctestplus-1.7.1-1.4.noarch.rpm"
RPM_HASH = "81e823b8578b18171da75775961c12d2a4f63a542565d5def57a61b29f117c3d52328db157e4193684198f8249d7c322f5bcf107339c8ad0c875213e0dece94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-doctestplus \
python3.13dist-pytest-doctestplus \
python313-pytest-doctestplus \
python3dist-pytest-doctestplus"

RDEPENDS:${PN} += "python-abi \
python313-packaging \
python313-pytest"

inherit rpm
