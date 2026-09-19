SUMMARY = "Microsoft Azure Server Manager Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Server Manager Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-azure-mgmt-servermanager-2.0.1-1.9.noarch.rpm"
RPM_HASH = "e8762ea8d6b5d7632bfd518558ed49bde7923676215c615f27816e2282a987251e5b87487fdf41105bfe415e8be5038d786cb546c7b65d43af3a862782d993aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-servermanager \
python314-azure-mgmt-servermanager \
python3dist-azure-mgmt-servermanager"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
