SUMMARY = "File Server"
DESCRIPTION = "The 32bit pattern complementing file_server."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-file_server-32bit-20250313-5.2.aarch64.rpm"
RPM_HASH = "85d94d7dfd5f1cc13eab5a519b01e795330c9acc09ed54f2a7a337570d884507e78520625ce437ee23155dd764831d51bfa43f30c92c5272a92d41070dc8129c"

RPROVIDES:${PN} += "pattern- \
patterns-server-file-server-32bit"

RDEPENDS:${PN} += ""

inherit rpm
