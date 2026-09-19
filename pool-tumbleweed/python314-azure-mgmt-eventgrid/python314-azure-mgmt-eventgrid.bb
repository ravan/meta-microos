SUMMARY = "Microsoft Azure EventGrid Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventGrid Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.4.0"

RPM_NAME = "python314-azure-mgmt-eventgrid-10.4.0-1.5.noarch.rpm"
RPM_HASH = "b3540f4d5cab6422a7d904a37e51779ce7e9dea8e84423bd47ec38321e55b18f93307c7aeaf5f17509223165cbdc39d2fd896576d9c7634f524afab566539837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-eventgrid \
python314-azure-mgmt-eventgrid \
python3dist-azure-mgmt-eventgrid"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
