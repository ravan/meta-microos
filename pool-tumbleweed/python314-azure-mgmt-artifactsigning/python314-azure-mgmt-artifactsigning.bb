SUMMARY = "Microsoft Azure Artifactsigning Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Artifactsigning Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-artifactsigning-1.0.0-1.4.noarch.rpm"
RPM_HASH = "31321688dc1868a925bddb7e91764b7d2ce1b0fe2064db275fbd55f2e4fc6bb132452a397a7b0c85f224b6c2cfbad0071eb90abc946fafbf2aacae16e47efb1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-artifactsigning \
python314-azure-mgmt-artifactsigning \
python3dist-azure-mgmt-artifactsigning"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
