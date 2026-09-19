SUMMARY = "Source code of opencensus-proto"
DESCRIPTION = "Protocol buffers for OpenCensus - a framework for collecting metrics and \
distributed traces from services. \
 \
This package contains source code for googleapis."
LICENSE = "Apache-2.0"

PV = "0.3.0+git.20200721"

RPM_NAME = "opencensus-proto-source-0.3.0+git.20200721-1.11.noarch.rpm"
RPM_HASH = "623add3cf19937cba9c18a4d23f9846d16dcfcc41005ba12c0935caeeadf392cfcf63783c3cfa98ace8786ae55cdc23483163d908a769c9fb14f52c28620e55d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencensus-proto-source"

RDEPENDS:${PN} += ""

inherit rpm
