SUMMARY = "Microsoft Azure Developer DevCenter Service Client Library for Python"
DESCRIPTION = "The Azure DevCenter package provides access to manage resources for Microsoft Dev Box \
and Azure Deployment Environments. This SDK enables managing developer machines and \
environments in Azure. \
 \
Use the package for Azure DevCenter to: \
 \
Create, access, manage, and delete Dev Box resources Create, \
deploy, manage, and delete Environment resources"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-developer-devcenter-1.0.0-1.8.noarch.rpm"
RPM_HASH = "51b7e2f41d36516df6d0abbdbb041dbede825409340f77e00b0e73c8cd2d6499f49481c68a5fc7afaa5d35a7faf2a1d8e7a082362e72e58a181329a64ef874fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-developer-devcenter \
python314-azure-developer-devcenter \
python3dist-azure-developer-devcenter"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
