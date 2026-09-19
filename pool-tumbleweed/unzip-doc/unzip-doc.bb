SUMMARY = "Documentation files for unzip"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-doc-6.00-45.3.noarch.rpm"
RPM_HASH = "96146c6caec82f207abf8c1a9169412368949fe8e7dfc847a3d58965d3ea777b1aa925143c469158333ecfa39ddbddecafaf2417623a8a180dc3f5f4c6db534f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unzip-doc"

RDEPENDS:${PN} += ""

inherit rpm
