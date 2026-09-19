SUMMARY = "Microsoft Corporation Azure Onlineexperimentation Client Library for Python"
DESCRIPTION = "This package contains Azure Online Experimentation client library for \
interacting with Microsoft.OnlineExperimentation/workspaces resources."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-onlineexperimentation-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "cad4f46c50e27af24d62c3a945e44be21f0db82db5ec3b357ad8a9ed6e0ba831e856c6841783ba291104367dfc37767cdb121701da0adf0301e8672ce138cafb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-onlineexperimentation \
python3.13dist-azure-onlineexperimentation \
python313-azure-onlineexperimentation \
python3dist-azure-onlineexperimentation"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
