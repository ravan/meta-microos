SUMMARY = "Command Line Tool to Process XML Documents"
DESCRIPTION = "XMLStarlet (xml) is a command line XML toolkit which can be used to \
transform, query, validate, and edit XML documents and files using simple \
set of shell commands in similar way it is done for plain text files using \
'grep', 'sed', 'awk', 'tr', 'diff', or 'patch'."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "xmlstarlet-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "e74a65a26c239e91834e3a8a995185676358b8a9a563679ec58265956c91dac6847f0b7771ccdde497d325e3b8720a0323c54cac0d34a2cceaf3c291cd60d226"

RPROVIDES:${PN} += "xmlstarlet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
