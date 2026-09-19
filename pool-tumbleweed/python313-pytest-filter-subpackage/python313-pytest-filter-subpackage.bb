SUMMARY = "Pytest plugin for filtering based on sub-packages"
DESCRIPTION = "This package contains a simple plugin for the pytest framework that provides a \
shortcut to testing all code and documentation for a given sub-package."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python313-pytest-filter-subpackage-0.2.0-2.6.noarch.rpm"
RPM_HASH = "3e0d5effb686d05b63cd66479d609e8fb6e103aeab2b47b38a02617a1e5abb40ce073295c7eb596ff821910456da6e6ca2370f7d20cbb465287f6c0357f977ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-filter-subpackage \
python3.13dist-pytest-filter-subpackage \
python313-pytest-filter-subpackage \
python3dist-pytest-filter-subpackage"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
