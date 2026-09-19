SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-azure-mgmt-kubernetesconfiguration-3.1.0-2.9.noarch.rpm"
RPM_HASH = "5dba34d406e004374607e1c87a68214ca68cc1a49c93da28c6a8e7e5b3195f82de91f3fc19fea291eb4201dcd9ef698e896ba258ea68e6913f610df6e634c57c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-kubernetesconfiguration \
python314-azure-mgmt-kubernetesconfiguration \
python3dist-azure-mgmt-kubernetesconfiguration"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
