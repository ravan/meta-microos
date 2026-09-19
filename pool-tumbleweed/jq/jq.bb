SUMMARY = "A lightweight and flexible command-line JSON processor"
DESCRIPTION = "A lightweight and flexible command-line JSON processor. jq is like sed for \
JSON data – you can use it to slice and filter and map and transform \
structured data with the same ease that sed, awk, grep and friends let \
you play with text."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.8.2"

RPM_NAME = "jq-1.8.2-2.1.aarch64.rpm"
RPM_HASH = "39466e3fc0560a7d7e5157afd29f021837ddb14fa678427cffe8bfa8f917d66fd936dd8196dfbd852fe9f74dc11045e9ca059ca0ed127ca4021ff5ac88a4ccb7"

RPROVIDES:${PN} += "jq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjq.so.1 \
libjq1 \
libonig.so.5"

inherit rpm
