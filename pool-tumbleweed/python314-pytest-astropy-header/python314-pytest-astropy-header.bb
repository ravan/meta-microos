SUMMARY = "Pytest plugin to add diagnostic information to the header of the test output"
DESCRIPTION = "This plugin package provides a way to include information about the system, \
Python installation, and select dependencies in the header of the output when \
running pytest. It can be used with packages that are not affiliated with the \
Astropy project, but is optimized for use with astropy-related projects."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python314-pytest-astropy-header-0.2.2-2.6.noarch.rpm"
RPM_HASH = "013021aef6aed69d66237b1951548bf375b6c0c26e4edbce5599b330218ad9a3d3867a97bdc1b20354172f1268078146adeea2563c926475d23303882b1fdc28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-astropy-header \
python314-pytest-astropy-header \
python3dist-pytest-astropy-header"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
