SUMMARY = "Microsoft Azure Containerorchestratorruntime Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Containerorchestratorruntime Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-containerorchestratorruntime-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "5663f09d588c17b67c44cce2787d00c2698c4e4d7354f6b9b4ca279e0010bd2288f896073cb5e22e27553c0f571238a68a3d7192be300e7518430e3a0cb78673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-containerorchestratorruntime \
python314-azure-mgmt-containerorchestratorruntime \
python3dist-azure-mgmt-containerorchestratorruntime"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
