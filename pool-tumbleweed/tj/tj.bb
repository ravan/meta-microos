SUMMARY = "Timestamp input"
DESCRIPTION = "tj adds a timestamp to the beginning of each line of input. \
It supports several time-formats and can also colorize the output. \
Users could also define custom output formats via templates."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "tj-7.0.0-3.8.aarch64.rpm"
RPM_HASH = "0251227fcea659e63ee0c4c63e3fe2d068f178122fcc63506169147410898fb7994e06be74b06acf62a789b135e13598ea76d2477165d20812cf45ab4219f724"

RPROVIDES:${PN} += "tj"

RDEPENDS:${PN} += ""

inherit rpm
