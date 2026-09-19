SUMMARY = "Microsoft Azure Dependencymap Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dependencymap Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-dependencymap-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "9f652df95e6fdf64113651d57b2decf2a44843d6017519fd741e00720419d577f9d773310e8d3f37cf912c85b02db4764ab146e258f99bb72ffd2a8ba5849150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dependencymap \
python3.13dist-azure-mgmt-dependencymap \
python313-azure-mgmt-dependencymap \
python3dist-azure-mgmt-dependencymap"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
