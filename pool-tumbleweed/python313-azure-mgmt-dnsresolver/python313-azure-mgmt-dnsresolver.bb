SUMMARY = "Microsoft Azure Dnsresolver Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dnsresolver Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-dnsresolver-1.1.0-1.5.noarch.rpm"
RPM_HASH = "0193e91651a805334ae57fe48081964ceb95adbe8b1706ef3875703aae3ef4dc1501b44a3def9a9b2039239677c3d6e758b116fc99436f8497ec7564d2a5f9f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dnsresolver \
python3.13dist-azure-mgmt-dnsresolver \
python313-azure-mgmt-dnsresolver \
python3dist-azure-mgmt-dnsresolver"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
