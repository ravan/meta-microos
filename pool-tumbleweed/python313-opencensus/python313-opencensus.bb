SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.4"

RPM_NAME = "python313-opencensus-0.11.4-2.7.noarch.rpm"
RPM_HASH = "756abcc71437045f8c17425377dbb38551a6464bd33e05c9aae3dc7a198a0ebadbe94ed6202bcbee0c6e3525ea44015f9c4aa9e2a38e9fb7b1c89c603e1904b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus \
python3.13dist-opencensus \
python313-opencensus \
python3dist-opencensus"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-opencensus-context \
python313-six"

inherit rpm
