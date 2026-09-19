SUMMARY = "Microsoft Azure Hybrid Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Hybrid Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python314-azure-mgmt-hybridcompute-10.0.0-1.1.noarch.rpm"
RPM_HASH = "e4e523ad5ed4e926afcfdc3e20f360672f39597c6dbb17e24871a8df925633cc6513a1945ed5cb4299e9c242e53222f8c181b5b8c5b56d9168e458cd57beafa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hybridcompute \
python314-azure-mgmt-hybridcompute \
python3dist-azure-mgmt-hybridcompute"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
