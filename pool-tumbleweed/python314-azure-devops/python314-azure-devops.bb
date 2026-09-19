SUMMARY = "Python wrapper around the Azure DevOps 5x APIs"
DESCRIPTION = "Python wrapper around the Azure DevOps 5.x APIs"
LICENSE = "MIT"

PV = "7.1.0~b4"

RPM_NAME = "python314-azure-devops-7.1.0~b4-4.8.noarch.rpm"
RPM_HASH = "04870a7806f70194fd4a453eced7eaa358aa0031785f96161d9ec2d7ce4f467f052ca68a25fbb251cf1cd122e7f39e712350c9a9bf05647a9655bc530d7385d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-devops \
python314-azure-devops \
python3dist-azure-devops"

RDEPENDS:${PN} += "-python314-msrest >= 0.7.1 with python314-msrest < 0.8.0 \
python-abi \
python314-azure-nspkg"

inherit rpm
