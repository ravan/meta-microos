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

RPM_NAME = "python313-azure-developer-devcenter-1.0.0-1.8.noarch.rpm"
RPM_HASH = "e2357da0ab211846af819415eef5ef8fae796f8ef69739138fe850ee848fc48c6668775319feea96605b1b7b8175571661d35d3af4bbc1c640ad930a7c10e7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-developer-devcenter \
python3.13dist-azure-developer-devcenter \
python313-azure-developer-devcenter \
python3dist-azure-developer-devcenter"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
