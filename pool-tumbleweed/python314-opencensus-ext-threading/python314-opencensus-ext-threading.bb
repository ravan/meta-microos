SUMMARY = "OpenCensus threading Integration"
DESCRIPTION = "OpenCensus threading Integration"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python314-opencensus-ext-threading-0.1.2-4.8.noarch.rpm"
RPM_HASH = "e0fe921893057b723f85defd04357e64ed5008fb21a8686dbd8386e05f6fd1698b640708a511400b26cc4862a1c7884f63bebd290f137318f20fa05ae41a8c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opencensus-ext-threading \
python314-opencensus-ext-threading \
python3dist-opencensus-ext-threading"

RDEPENDS:${PN} += "python-abi \
python314-opencensus"

inherit rpm
