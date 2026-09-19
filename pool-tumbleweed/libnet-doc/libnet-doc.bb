SUMMARY = "Documentation for libnet"
DESCRIPTION = "Libnet is an API to help with the construction and handling of network \
packets. This package contains documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libnet-doc-1.3-1.11.aarch64.rpm"
RPM_HASH = "9c64f204ececed3091f8d94591de95daa44b7caea32ceee18b2e7a0ff2b079a798ccab72f35f4c48a5efb40bd4ca047e98f8f47191558fef705722996ca6cda0"

RPROVIDES:${PN} += "libnet-doc"

RDEPENDS:${PN} += ""

inherit rpm
