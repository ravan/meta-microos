SUMMARY = "Microsoft Azure Purview Account Client Library for Python"
DESCRIPTION = "Azure Purview Account is a fully managed cloud service"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python314-azure-purview-account-1.0.0b1-3.9.noarch.rpm"
RPM_HASH = "fca287bdf44b0ce85b2c7a1db41238be6a368a5c6bc2d9e716ec11da47cd73bec00c943e8f9b23db50a5ea43d06914f389f016be4916af445a57990b85e2f696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-purview-account \
python314-azure-purview-account \
python3dist-azure-purview-account"

RDEPENDS:${PN} += "-python314-azure-core >= 1.16.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-purview-nspkg \
python314-msrest \
python314-six"

inherit rpm
