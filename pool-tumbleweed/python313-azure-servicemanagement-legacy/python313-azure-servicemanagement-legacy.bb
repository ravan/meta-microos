SUMMARY = "Microsoft Azure Service Management Legacy Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Management Legacy Client Library. \
 \
All packages in this bundle have been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "Apache-2.0"

PV = "0.20.8"

RPM_NAME = "python313-azure-servicemanagement-legacy-0.20.8-1.9.noarch.rpm"
RPM_HASH = "18f9502db6731071586f40fb05ee553bb91f2ee6ef7614c7427689c7fe49ef1a6c0eb2cb26438f3473b62270b71c8516a1ca975d56d0034f9524a278b5cfb9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicemanagement-legacy \
python3.13dist-azure-servicemanagement-legacy \
python313-azure-servicemanagement-legacy \
python3dist-azure-servicemanagement-legacy"

RDEPENDS:${PN} += "python-abi \
python313-azure-common \
python313-azure-nspkg \
python313-requests"

inherit rpm
