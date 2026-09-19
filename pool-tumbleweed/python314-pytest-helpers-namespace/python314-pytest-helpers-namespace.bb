SUMMARY = "PyTest Helpers Namespace"
DESCRIPTION = "PyTest Helpers Namespace."
LICENSE = "Apache-2.0"

PV = "2021.12.29"

RPM_NAME = "python314-pytest-helpers-namespace-2021.12.29-4.1.noarch.rpm"
RPM_HASH = "eadbc705e2d4d007b03312bf2b1d077eae451669ae4a439e102b3556232cd967f27adfa93b1494008be8a80508716c333e718d1acee5563e7e0f2319f3947cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-helpers-namespace \
python314-pytest-helpers-namespace \
python3dist-pytest-helpers-namespace"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
