SUMMARY = "Data readers extracted from the pandas codebase"
DESCRIPTION = "Remote data access for pandas. Works for multiple versions of pandas."
LICENSE = "BSD-3-Clause"

PV = "0.11.1"

RPM_NAME = "python313-pandas-datareader-0.11.1-1.1.noarch.rpm"
RPM_HASH = "3d9dc13efae34e258668da816f4ba70ea6c6ed0bf1416b6a5690b89b5a331826be431e44e5f62a4e05d9494396e4810b9702a4fffcad1c9a8369e2ffbf218f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-datareader \
python3.13dist-pandas-datareader \
python313-pandas-datareader \
python3dist-pandas-datareader"

RDEPENDS:${PN} += "python-abi \
python313-lxml \
python313-pandas \
python313-requests \
python313-setuptools"

inherit rpm
