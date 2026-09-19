SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python313-azure-synapse-artifacts-0.22.0-1.3.noarch.rpm"
RPM_HASH = "eb4cd1f00cadb852bc0f0872b7c8b139c6bed0a18db421a18138809e46b7768afeb2a3241894a6389e759638251b185ccf9b1899758c1ebc27ee64bdfd5cab69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse-artifacts \
python3.13dist-azure-synapse-artifacts \
python313-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "-python313-azure-core >= 1.6.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-synapse-nspkg \
python313-typing-extensions"

inherit rpm
