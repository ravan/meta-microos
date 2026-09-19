SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b10"

RPM_NAME = "python314-azure-core-tracing-opencensus-1.0.0b10-1.8.noarch.rpm"
RPM_HASH = "ab6e143d9ea13677ba18a6c68019ec2040966841240be57c7cf50b01d9eb6b96db3a4dce58865bc8d35621f43e78e9e3e363f5b16757a81c5ef948c7a992a01a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-core-tracing-opencensus \
python314-azure-core-tracing-opencensus \
python3dist-azure-core-tracing-opencensus"

RDEPENDS:${PN} += "-python314-azure-core >= 1.13.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-opencensus \
python314-opencensus-ext-azure \
python314-opencensus-ext-threading"

inherit rpm
