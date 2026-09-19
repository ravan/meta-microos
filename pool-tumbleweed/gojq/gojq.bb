SUMMARY = "Pure Go implementation of jq"
DESCRIPTION = "Pure Go implementation of jq."
LICENSE = "MIT"

PV = "0.12.19"

RPM_NAME = "gojq-0.12.19-2.1.aarch64.rpm"
RPM_HASH = "e31c01aa4fae992e3876f948c228c2f7e1d121a5593e8040074680737257376adfd3ab07c9f04669915e7c9d30979bc6e1a48ee7b27b16f6cb0220ec3a6c59de"

RPROVIDES:${PN} += "gojq"

RDEPENDS:${PN} += ""

inherit rpm
