SUMMARY = "Microsoft Azure Batch Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "15.1.0"

RPM_NAME = "python313-azure-batch-15.1.0-1.2.noarch.rpm"
RPM_HASH = "60fe7d54e3dca3d69f1591132e57ab5e3f21f1d2398f0a119a2aac9f55d9027c5ca0ef086308763eee12080469195c3598cdd31051d2142ba1c6a01a983c59a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-batch \
python3.13dist-azure-batch \
python313-azure-batch \
python3dist-azure-batch"

RDEPENDS:${PN} += "-python313-azure-core >= 1.37.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
