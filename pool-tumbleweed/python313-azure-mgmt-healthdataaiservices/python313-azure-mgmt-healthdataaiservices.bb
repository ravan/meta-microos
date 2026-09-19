SUMMARY = "Microsoft Azure Healthdataaiservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Healthdataaiservices Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-healthdataaiservices-1.0.0-1.8.noarch.rpm"
RPM_HASH = "b0b2527512f1ffdb06b166176baf9464a0566a328e54686d48f5313293c57fd259ddda6b27f33f43b7fcbd34cc032f37cda61072c1ecee9f6d9f342849fc965f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-healthdataaiservices \
python3.13dist-azure-mgmt-healthdataaiservices \
python313-azure-mgmt-healthdataaiservices \
python3dist-azure-mgmt-healthdataaiservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
