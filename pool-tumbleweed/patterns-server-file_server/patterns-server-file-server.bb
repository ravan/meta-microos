SUMMARY = "File Server"
DESCRIPTION = "File services to host files so that they may be accessed or retrieved by other computers on the same network. This includes the FTP, SMB, and NFS protocols."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-file_server-20250313-5.2.aarch64.rpm"
RPM_HASH = "f0a137e4a3e08e23c86d5f6d53540b02f1d672591e166d98b0b03d063d7ae293418ac4c4a3bb074c9c4830c3a9fbe3892319087fe39d5359bd15e901e16d4986"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-file-server \
patterns-server-file-server"

RDEPENDS:${PN} += "nfs-kernel-server \
pattern-"

inherit rpm
