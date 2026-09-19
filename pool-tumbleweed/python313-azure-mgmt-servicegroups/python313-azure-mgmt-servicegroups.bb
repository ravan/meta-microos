SUMMARY = "Microsoft Azure Service Groups Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Groups Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-servicegroups-1.0.0-1.1.noarch.rpm"
RPM_HASH = "6d82c58f07c761a120a64e8ea99569690c20ca05c2e2661e5cd88349a9e7d3dc74081a7ec1f8e1a1901e8493c3d370344a680cd5c3ec6c6bae9ecf8081786f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicegroups \
python3.13dist-azure-mgmt-servicegroups \
python313-azure-mgmt-servicegroups \
python3dist-azure-mgmt-servicegroups"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
