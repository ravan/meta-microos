SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python313-dask-test-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "ad9f11950751cad7eb71491b8fcd5900a5e72117477bb27127ab51bfb0ab769a2037efaeeaa1c32618fd8806c305eeabe32c42e8d431c1e2399b50a558d4393e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-test \
python313-dask-test"

RDEPENDS:${PN} += "python-abi \
python313-dask-complete \
python313-pandas-test \
python313-pytest \
python313-pytest-cov \
python313-pytest-mock \
python313-pytest-rerunfailures \
python313-pytest-timeout \
python313-pytest-xdist"

inherit rpm
