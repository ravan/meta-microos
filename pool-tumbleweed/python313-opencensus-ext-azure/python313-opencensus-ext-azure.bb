SUMMARY = "OpenCensus Azure Monitor Exporters"
DESCRIPTION = "OpenCensus Azure Monitor Exporters"
LICENSE = "Apache-2.0"

PV = "1.1.14"

RPM_NAME = "python313-opencensus-ext-azure-1.1.14-2.5.noarch.rpm"
RPM_HASH = "a1204c897aa110c44ed783dc2d2edaf799333577518f4caca5c443bf81d918ded21d911e1900e01ea4e4f22aeb65058ac83531a1f5f91effec1cc8ae1be14146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-ext-azure \
python3.13dist-opencensus-ext-azure \
python313-opencensus-ext-azure \
python3dist-opencensus-ext-azure"

RDEPENDS:${PN} += "python-abi \
python313-azure-core \
python313-azure-identity \
python313-opencensus \
python313-psutil \
python313-requests"

inherit rpm
