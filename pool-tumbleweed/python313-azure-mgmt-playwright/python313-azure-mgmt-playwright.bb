SUMMARY = "Microsoft Azure Playwright Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Playwright Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-playwright-1.0.0-1.4.noarch.rpm"
RPM_HASH = "24572c672a7b8facc84b0de951884cd105f69cf29916852ed7c6b3a41d5f284461057dcfec4bbd63f6d3d382ff76c48f139d4b58dc701811c17df509aa717e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-playwright \
python3.13dist-azure-mgmt-playwright \
python313-azure-mgmt-playwright \
python3dist-azure-mgmt-playwright"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
