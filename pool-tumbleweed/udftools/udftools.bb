SUMMARY = "UDF filesystem tools"
DESCRIPTION = "These are tools for UDF file systems as used, e.g., on DVD-ROMs."
LICENSE = "GPL-2.0-or-later"

PV = "2.3"

RPM_NAME = "udftools-2.3-1.23.aarch64.rpm"
RPM_HASH = "50baf13e09bc4b58c5ea487e0424d0bfffd048c3c7f4a1722e1b87645f8777136de33797f2c968e2f3e800efb78ad3449b90d87cdc73694aa526de078e699b56"

RPROVIDES:${PN} += "udf \
udftools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
