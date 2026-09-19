SUMMARY = "Data readers extracted from the pandas codebase"
DESCRIPTION = "Remote data access for pandas. Works for multiple versions of pandas."
LICENSE = "BSD-3-Clause"

PV = "0.11.1"

RPM_NAME = "python314-pandas-datareader-0.11.1-1.1.noarch.rpm"
RPM_HASH = "ef820bab87a2aa0396f897b39132cb353cc6ae5bb00759107c94b1c1d58b43a3ae7b2698257a2f3dc2d8b124f004f00b90c7db119e9b7d54fbc650cecc894d8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pandas-datareader \
python314-pandas-datareader \
python3dist-pandas-datareader"

RDEPENDS:${PN} += "python-abi \
python314-lxml \
python314-pandas \
python314-requests \
python314-setuptools"

inherit rpm
