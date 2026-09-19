SUMMARY = "Microsoft Azure Digitaltwins Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.digitaltwins namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-digitaltwins-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "8fdbc8e4e7c0f2dd7c199730db9fff3853d2246bc12df5b839b1a8d3ab6eabc5cb9e6d8b97f127f06e78928db3b1e8caec9060fe4ddf645d3cf672aece748150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-digitaltwins-nspkg \
python3.13dist-azure-digitaltwins-nspkg \
python313-azure-digitaltwins-nspkg \
python3dist-azure-digitaltwins-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
