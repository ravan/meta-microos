SUMMARY = "Source code of the OpenTracing C++ API"
DESCRIPTION = "Source code of opentracing-cpp - the C++ implementation of the OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "opentracing-cpp-source-1.6.0-1.20.noarch.rpm"
RPM_HASH = "9084139c727e247ae2be818dd730033a26ac46e37ba95963760d53f19bc5f3077bde3ebfa1483f907ae3d2f08e671a5a65c822d7d7552dde0c56b13c03d9830b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opentracing-cpp-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
