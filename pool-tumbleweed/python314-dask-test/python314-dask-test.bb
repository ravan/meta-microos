SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python314-dask-test-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "3870e50cf4038fe9296c67f4ad9afd5838209e8c497d7072c523587c1df2cbe67afd3a5a2b651afe59d92ac4952624192f003111edb2394fd3f508a0c35358cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-dask-test"

RDEPENDS:${PN} += "python-abi \
python314-dask-complete \
python314-pandas-test \
python314-pytest \
python314-pytest-cov \
python314-pytest-mock \
python314-pytest-rerunfailures \
python314-pytest-timeout \
python314-pytest-xdist"

inherit rpm
