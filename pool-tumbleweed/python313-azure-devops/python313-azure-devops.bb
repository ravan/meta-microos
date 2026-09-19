SUMMARY = "Python wrapper around the Azure DevOps 5x APIs"
DESCRIPTION = "Python wrapper around the Azure DevOps 5.x APIs"
LICENSE = "MIT"

PV = "7.1.0~b4"

RPM_NAME = "python313-azure-devops-7.1.0~b4-4.8.noarch.rpm"
RPM_HASH = "e671520f3236551db3940222a4b36627e9a35a7b6562dfd81ccac25dfc3e0751f103f61d29fb50d3e24c4f151b306b70e2ea34a9536a3258e78b3f073d667a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-devops \
python3.13dist-azure-devops \
python313-azure-devops \
python3dist-azure-devops"

RDEPENDS:${PN} += "-python313-msrest >= 0.7.1 with python313-msrest < 0.8.0 \
python-abi \
python313-azure-nspkg"

inherit rpm
