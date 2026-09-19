SUMMARY = "Utilities for working with libt3highlight"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files. \
 \
This subpackage contains the T3 highlighting utility."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight-utils-0.5.0-1.26.aarch64.rpm"
RPM_HASH = "ceab96042a10c80a09de59f2a437fbc655748e85eeee274c47f48c212f6f63f9ed514542fff5b7c04a3d51a5d74d083d7dceb51e16913c1509754b06bc4e0ecf"

RPROVIDES:${PN} += "libt3highlight-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libt3config.so.0 \
libt3highlight.so.2"

inherit rpm
