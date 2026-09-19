SUMMARY = "Microsoft Azure Synapse Artifacts Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Artifacts Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python314-azure-synapse-artifacts-0.22.0-1.3.noarch.rpm"
RPM_HASH = "9e194846651606652e73b274884b47435a11a7427aaf148e3d17deb9bcc8b0fff01f277c877ec2f8617f930fca66bec71fb9f5c336b0d4d0bd0ac433784aea4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-synapse-artifacts \
python314-azure-synapse-artifacts \
python3dist-azure-synapse-artifacts"

RDEPENDS:${PN} += "-python314-azure-core >= 1.6.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-synapse-nspkg \
python314-typing-extensions"

inherit rpm
