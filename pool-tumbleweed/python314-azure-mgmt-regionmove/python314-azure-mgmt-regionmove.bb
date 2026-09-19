SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python314-azure-mgmt-regionmove-1.0.0b1-4.9.noarch.rpm"
RPM_HASH = "e1496b6d6aaa16f9ed5e6fad30e38444354b49b4dab359409daf519e429a3a184bbacf8a78414d508bdadeead108bab1ad9ae9346f3c223568d5e6e3c71b6865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-regionmove \
python314-azure-mgmt-regionmove \
python3dist-azure-mgmt-regionmove"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-msrestazure >= 0.4.32 with python314-msrestazure < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
