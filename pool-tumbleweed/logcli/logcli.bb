SUMMARY = "LogCLI tool"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation \
system inspired by Prometheus. \
 \
This package contains the LogCLI command-line tool."
LICENSE = "Apache-2.0"

PV = "3.7.7"

RPM_NAME = "logcli-3.7.7-1.1.aarch64.rpm"
RPM_HASH = "d51f2de5adbd3d9b442555da0e613c55877094cca1dc5415a2dddefc8afda21ee2cb9ebab28bfd12994eec56d0559329433c4cacc9e605394de6d8a93b49ffa6"

RPROVIDES:${PN} += "logcli"

RDEPENDS:${PN} += ""

inherit rpm
