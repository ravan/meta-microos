SUMMARY = "Microsoft Azure Synapse Spark Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python314-azure-synapse-spark-0.7.0-3.9.noarch.rpm"
RPM_HASH = "6f3baf776c69613232ee55990f67b2ad0b02575cb1c15e024ab05cc08d658c4557a7551489f8f076f826ae3276df816b08db439d388ae1a281b052fd8179d502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-synapse-spark \
python314-azure-synapse-spark \
python3dist-azure-synapse-spark"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.6.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-synapse-nspkg \
python314-msrest"

inherit rpm
