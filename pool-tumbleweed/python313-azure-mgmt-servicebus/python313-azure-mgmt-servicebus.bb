SUMMARY = "Microsoft Azure Service Bus Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0~b1"

RPM_NAME = "python313-azure-mgmt-servicebus-10.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "d5c632e571eb73cf55388666be9ba5b7ea2ae59cc0810a3bfeadb2fd433cc818b1b6ff51e26d71d18620fb308f2013d1f9050a7936f63cc05353b25edae8c892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicebus \
python3.13dist-azure-mgmt-servicebus \
python313-azure-mgmt-servicebus \
python3dist-azure-mgmt-servicebus"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
