SUMMARY = "Microsoft Azure HybridKubernetes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure HybridKubernetes Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-azure-mgmt-hybridkubernetes-1.2.0-1.2.noarch.rpm"
RPM_HASH = "a87a531a062d57d0c49b4bd91770ed22639dbb7444e3c7d67a287b42ef0e4567e79399e1fce23c031e8d6d619e243a3bd2154a73da8df8814e4d58e51ec880ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridkubernetes \
python3.13dist-azure-mgmt-hybridkubernetes \
python313-azure-mgmt-hybridkubernetes \
python3dist-azure-mgmt-hybridkubernetes"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
