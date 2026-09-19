SUMMARY = "Microsoft Azure Dnsresolver Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dnsresolver Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-dnsresolver-1.1.0-1.5.noarch.rpm"
RPM_HASH = "b61434cd10c68ff3e4b7474fd57ee0171ba626dc4282bad0c21c82c1d0e496eadf9927f9bb6639c56bd98ed778703ba2a1e7b8e830d0becbb737a4387f3f926a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-dnsresolver \
python314-azure-mgmt-dnsresolver \
python3dist-azure-mgmt-dnsresolver"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
