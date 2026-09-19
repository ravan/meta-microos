SUMMARY = "PyTest Helpers Namespace"
DESCRIPTION = "PyTest Helpers Namespace."
LICENSE = "Apache-2.0"

PV = "2021.12.29"

RPM_NAME = "python313-pytest-helpers-namespace-2021.12.29-4.1.noarch.rpm"
RPM_HASH = "7104b0c908e5612d5d079d0dfc56a36bee150869945a787047db6f2283fccebcddce2e95aced4b4b4081984931480893c45546316462897b8bf56c2d24458305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-helpers-namespace \
python3.13dist-pytest-helpers-namespace \
python313-pytest-helpers-namespace \
python3dist-pytest-helpers-namespace"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
