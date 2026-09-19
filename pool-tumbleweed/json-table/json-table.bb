SUMMARY = "Nested JSON data to tabular data transformer"
DESCRIPTION = "Jt reads UTF-8 encoded JSON forms from stdin and writes tab separated \
values (or CSV) to stdout. A simple stack-based programming language \
is used to extract values from the JSON input for printing."
LICENSE = "EPL-1.0"

PV = "4.3.3"

RPM_NAME = "json-table-4.3.3-3.9.aarch64.rpm"
RPM_HASH = "f972b91db9a1ae04ed20b3af54108e38c09f57cc92f021c390045a07954d4f8af2ac485fcc07b9b546089f132388af017d7499f35639a16628b601d48de48c56"

RPROVIDES:${PN} += "json-table"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
