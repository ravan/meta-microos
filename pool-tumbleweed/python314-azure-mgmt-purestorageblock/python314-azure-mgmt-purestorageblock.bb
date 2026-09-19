SUMMARY = "Microsoft Azure Purestorageblock Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purestorageblock Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-purestorageblock-1.0.0-1.5.noarch.rpm"
RPM_HASH = "870b7a872f93d3b36ef4b1fdcb88b56ef56d03b58f4ecf89224407b91f0acbcd4388df90ef224c66f2cdefb9de68b965ddf94221ab1b7160c04704f6605e6bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-purestorageblock \
python314-azure-mgmt-purestorageblock \
python3dist-azure-mgmt-purestorageblock"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
