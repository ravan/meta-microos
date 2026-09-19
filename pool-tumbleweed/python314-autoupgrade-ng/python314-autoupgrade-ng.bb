SUMMARY = "Automatic upgrade of PyPI packages"
DESCRIPTION = "Automatic upgrade of PyPI packages from within Python scripts \
 \
The upgrade will be unattended and the python script will be restarted. \
 \
Old methods are still supported."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-autoupgrade-ng-0.3.0-4.5.noarch.rpm"
RPM_HASH = "d0aa09027a6f3a92ce6b23a046503742c4420817bd26695e5d66d537d68f35364e4fc4d56211d4408f62579074f184ef60bf199db4a4996d6b97c61224273824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-autoupgrade-ng \
python314-autoupgrade-ng \
python3dist-autoupgrade-ng"

RDEPENDS:${PN} += "python-abi \
python314-pip"

inherit rpm
