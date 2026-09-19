SUMMARY = "Microsoft Azure Purview Account Client Library for Python"
DESCRIPTION = "Azure Purview Account is a fully managed cloud service"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python313-azure-purview-account-1.0.0b1-3.9.noarch.rpm"
RPM_HASH = "78ca6492de3478375a53552180c3ae5b460a8ad82ba0d0e62400192d5546f497304536ced5f71a57b6701ab550847e1ba25b3273449b8a93d006d4d552e5ada6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-account \
python3.13dist-azure-purview-account \
python313-azure-purview-account \
python3dist-azure-purview-account"

RDEPENDS:${PN} += "-python313-azure-core >= 1.16.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-purview-nspkg \
python313-msrest \
python313-six"

inherit rpm
