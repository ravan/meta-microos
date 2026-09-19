SUMMARY = "Microsoft Azure Mixed Reality Authentication Client Library for Python"
DESCRIPTION = "Mixed Reality services, like Azure Spatial Anchors, Azure Remote Rendering, and \
others, use the Mixed Reality security token service (STS) for authentication. \
 \
This package supports exchanging Mixed Reality account credentials for an access \
token from the STS that can be used to access Mixed Reality services."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python313-azure-mixedreality-authentication-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "4000c67bfad01d85a5e592e27792871dac8396a8074788cd41c3618f94ba22aac30ae3ee2bc2d8be94ce0656346072812aacd12ea148c6750dbab05e4387d189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mixedreality-authentication \
python3.13dist-azure-mixedreality-authentication \
python313-azure-mixedreality-authentication \
python3dist-azure-mixedreality-authentication"

RDEPENDS:${PN} += "-python313-azure-core >= 1.4.0 with python313-azure-core < 2.0.0 \
-python313-msrest >= 0.6.21 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mixedreality-nspkg"

inherit rpm
