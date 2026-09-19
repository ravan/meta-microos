SUMMARY = "Source code of prometheus-client-model"
DESCRIPTION = "prometheus-client-model provides data model artifacts for Prometheus in form of \
protobufs and libraries. \
 \
This package contains source code for prometheus-client-model."
LICENSE = "Apache-2.0"

PV = "20190109"

RPM_NAME = "prometheus-client-model-source-20190109-3.17.noarch.rpm"
RPM_HASH = "ba5df1b35214c3df81bcc41192543462700c3d3d398399621f94ea6dfe85413a63c3a1ca9d6f5f331b071ed782657009b7e7db8fa426844ac49777aa539c1ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-client-model-source"

RDEPENDS:${PN} += ""

inherit rpm
