SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python313-azure-synapse-spark-0.7.0-3.9.noarch.rpm"
RPM_HASH = "62a7d5b3e70b9d543ec8cec2eb2f85474a4e1f9d55701ed79485383d6ce48045714ca60775efedea6c8d31d09a15528fefdb1f6e4ed5c38e157488a0cec54e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse-spark \
python3.13dist-azure-synapse-spark \
python313-azure-synapse-spark \
python3dist-azure-synapse-spark"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.6.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-synapse-nspkg \
python313-msrest"

inherit rpm
