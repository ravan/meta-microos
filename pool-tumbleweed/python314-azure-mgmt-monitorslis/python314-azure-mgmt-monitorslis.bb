SUMMARY = "Microsoft Azure Monitorslis Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitorslis Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-monitorslis-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "2fe366f54568b3d7f8e06ed21e6ae476a1e8dadc266a8f754f60c4f7b7cab55d913494470a966e90dd427c1204e9474f1d9fdc34023aa2e556629d8ad473c649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-monitorslis \
python314-azure-mgmt-monitorslis \
python3dist-azure-mgmt-monitorslis"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
