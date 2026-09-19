SUMMARY = "Microsoft Azure FileShares Management Client Library"
DESCRIPTION = "This is the Microsoft Azure FileShares Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-fileshares-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "b3aec0fcb9a4ac01000017574357b89026f8c99d0c942b38b629e4693ea16fb3418f80e742c44e60a8505f977b671b8640c7f2d5f80727665e555f0ba432d3ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-fileshares \
python3.13dist-azure-mgmt-fileshares \
python313-azure-mgmt-fileshares \
python3dist-azure-mgmt-fileshares"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
