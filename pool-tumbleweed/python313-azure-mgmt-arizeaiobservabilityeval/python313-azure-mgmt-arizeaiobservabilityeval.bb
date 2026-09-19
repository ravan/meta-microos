SUMMARY = "Microsoft Azure Arizeaiobservabilityeval Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Arizeaiobservabilityeval Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-arizeaiobservabilityeval-1.0.0-1.5.noarch.rpm"
RPM_HASH = "48ce68064ccde18b84b4d127cb0f28a8c38afeb225578481ab317584e43270cc3375728e09ed1b4728844e2d19e08141bdb36c75443e803c4d2f33faaca4b1b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-arizeaiobservabilityeval \
python3.13dist-azure-mgmt-arizeaiobservabilityeval \
python313-azure-mgmt-arizeaiobservabilityeval \
python3dist-azure-mgmt-arizeaiobservabilityeval"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
