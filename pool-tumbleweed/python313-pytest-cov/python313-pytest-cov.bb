SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python313-pytest-cov-7.1.0-1.3.noarch.rpm"
RPM_HASH = "3d51eb780b8198d63eeca790d0d5f4bfdc796a1782e318b0b8cfad36f4f5f3bf4d9e6019432f4d2354f4486f05509fd1e43f8e04127a202bc3cd6dcf8196cf1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cov \
python3.13dist-pytest-cov \
python313-pytest-cov \
python3dist-pytest-cov"

RDEPENDS:${PN} += "python-abi \
python313-coverage \
python313-pluggy \
python313-pytest"

inherit rpm
