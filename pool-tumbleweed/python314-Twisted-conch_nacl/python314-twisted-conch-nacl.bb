SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python314-Twisted-conch_nacl-26.4.0-3.3.noarch.rpm"
RPM_HASH = "00d4e1047c367d3821ff05b645e66fb94cf01821514482cf0d68ea4e65d9ff5e6e3e6f4b8ecaf09d86f9fbc3e79e5be11b067cc8a9ff37124d96f4df6ed053d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-Twisted-conch-nacl"

RDEPENDS:${PN} += "python314-Twisted-conch"

inherit rpm
