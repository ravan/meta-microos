SUMMARY = "Microsoft Azure Arizeaiobservabilityeval Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Arizeaiobservabilityeval Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-arizeaiobservabilityeval-1.0.0-1.5.noarch.rpm"
RPM_HASH = "3e2506380d436a403d546b6aa398b45632fe564af0cd6a28792b52c138ea846282809ed70393d77352263c89cd491addb6f8eed3027f43e95a03b1b67ef7d702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-arizeaiobservabilityeval \
python314-azure-mgmt-arizeaiobservabilityeval \
python3dist-azure-mgmt-arizeaiobservabilityeval"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
