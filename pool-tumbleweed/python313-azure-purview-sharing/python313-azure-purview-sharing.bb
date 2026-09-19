SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python313-azure-purview-sharing-1.0.0~b3-2.9.noarch.rpm"
RPM_HASH = "f934dde0c47a47b86f6bde10f82f06af68459aeaefe6877aa9c191bb93276c711995060747a40ddbcd58c2f50efc3f222bfc26b9782f12091d6b0aa913f577bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-sharing \
python3.13dist-azure-purview-sharing \
python313-azure-purview-sharing \
python3dist-azure-purview-sharing"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-purview-nspkg"

inherit rpm
