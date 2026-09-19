SUMMARY = "Microsoft Azure Service Fabric Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0.0"

RPM_NAME = "python314-azure-servicefabric-8.2.0.0-3.9.noarch.rpm"
RPM_HASH = "9f2bc53e5537f82731c2429359dec637495517241fa2f84634e13697f7e3e315bd72705e50cce6b3ef64b318466be1204b79cb33ea6bc9c7ad1a0e61a94088b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-servicefabric \
python314-azure-servicefabric \
python3dist-azure-servicefabric"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest"

inherit rpm
