SUMMARY = "OpenCensus Azure Monitor Exporters"
DESCRIPTION = "OpenCensus Azure Monitor Exporters"
LICENSE = "Apache-2.0"

PV = "1.1.14"

RPM_NAME = "python314-opencensus-ext-azure-1.1.14-2.5.noarch.rpm"
RPM_HASH = "7f2127c42fca2f771a02e63002f2b1a989c21fe7a317d4d771c29637fae6fd91be2c5335143bfb69b511ba7be8e83bc197c85d7a45e99f1f4f71d7d34acc1cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opencensus-ext-azure \
python314-opencensus-ext-azure \
python3dist-opencensus-ext-azure"

RDEPENDS:${PN} += "python-abi \
python314-azure-core \
python314-azure-identity \
python314-opencensus \
python314-psutil \
python314-requests"

inherit rpm
