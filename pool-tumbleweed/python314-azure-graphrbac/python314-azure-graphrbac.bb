SUMMARY = "Microsoft Azure Graph RBAC Client Library"
DESCRIPTION = "This is the Microsoft Azure Graph RBAC Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.61.2"

RPM_NAME = "python314-azure-graphrbac-0.61.2-1.9.noarch.rpm"
RPM_HASH = "07f032f041802e07891ee4e486d4e1eb57106569242bf16a0224e794a9328dca47b60982023cf6cf2942ddf31a3fd491bbb16cac4f09f4edfcbd433ae9b4cbb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-graphrbac \
python314-azure-graphrbac \
python3dist-azure-graphrbac"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-msrestazure >= 0.4.32 with python314-msrestazure < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest"

inherit rpm
