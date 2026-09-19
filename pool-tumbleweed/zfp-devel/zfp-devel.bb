SUMMARY = "Development files for zfp"
DESCRIPTION = "Development package for zfp."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "zfp-devel-1.0.1-1.12.aarch64.rpm"
RPM_HASH = "137bb6dd4179c9479df8d9a20b71d81f76d12a84f75fffb60f3555825b877cbb2999ad3dbc90a631b5cc3269c74b68945ddb6ae60d0c27e0d3107bb369def9f3"

RPROVIDES:${PN} += "cmake-zfp \
zfp-devel"

RDEPENDS:${PN} += "libzfp1"

inherit rpm
