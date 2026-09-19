SUMMARY = "Microsoft Azure Containerorchestratorruntime Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Containerorchestratorruntime Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-containerorchestratorruntime-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "cc5ecabb2936276124fca83ae0cd7c03edc8704586d8e63cfe64ac5c7f4bfb92dec36c3a69c8336c0e227daf0eb195c7da3b63ff5127f8aad81ff8cfb7024595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerorchestratorruntime \
python3.13dist-azure-mgmt-containerorchestratorruntime \
python313-azure-mgmt-containerorchestratorruntime \
python3dist-azure-mgmt-containerorchestratorruntime"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
