SUMMARY = "Tool to detect ineffectual assignments in Go code"
DESCRIPTION = "This tool misses some cases because does not consider any type information in \
its analysis. (For example, assignments to struct fields are never marked as \
ineffectual.) It should, however, never give any false positives."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "ineffassign-0.2.0-1.4.aarch64.rpm"
RPM_HASH = "443fe82e599df4fab11d01df2f3891e5c94485030f51d7553d15851a92ac9ed0aab0fa6b0e0a5d8f844e0524081040defe6179e5e62a406e43eb1d50c3bc0dfe"

RPROVIDES:${PN} += "ineffassign"

RDEPENDS:${PN} += ""

inherit rpm
