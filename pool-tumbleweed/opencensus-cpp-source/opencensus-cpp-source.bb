SUMMARY = "Source code of opencensus-cpp"
DESCRIPTION = "OpenCensus is a toolkit for collecting application performance and behavior \
data. It currently includes an API for tracing and stats. \
 \
This package provides source code of opencensus-cpp."
LICENSE = "Apache-2.0"

PV = "0.4.0+git.20190924"

RPM_NAME = "opencensus-cpp-source-0.4.0+git.20190924-1.18.noarch.rpm"
RPM_HASH = "63db9540bf0947e9e768ccab9b3a59a070af6fee124825f5afe72062c4b07dcc490d30072a320fd4d1bbec764b526e4f8d1bc0c4e44477533cebddf9c0bd2686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencensus-cpp-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env"

inherit rpm
