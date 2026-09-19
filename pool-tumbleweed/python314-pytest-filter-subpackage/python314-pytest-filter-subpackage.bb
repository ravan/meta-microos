SUMMARY = "Pytest plugin for filtering based on sub-packages"
DESCRIPTION = "This package contains a simple plugin for the pytest framework that provides a \
shortcut to testing all code and documentation for a given sub-package."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python314-pytest-filter-subpackage-0.2.0-2.6.noarch.rpm"
RPM_HASH = "02e7aefac987512b3edcfc37c68c1066244e0b4174dca4eabb938cfdc49742ee6c0c3ed54e7c5fcad7c082f8fe14c5368e7f49e667a693655941295ce4bf8766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-filter-subpackage \
python314-pytest-filter-subpackage \
python3dist-pytest-filter-subpackage"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
