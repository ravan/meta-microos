SUMMARY = "Utility for creating Czech or Slovak Sorted LaTeX Index Files"
DESCRIPTION = "This program creates Czech and Slovak sorted index files for LaTeX. \
Usage: csindex -z il2 file.idx Creates file.ind - a sorted index file. \
Uses the ISO 8859-2 encoding."
LICENSE = "MakeIndex"

PV = "19980713"

RPM_NAME = "csindex-19980713-681.3.aarch64.rpm"
RPM_HASH = "c352217c893bdd1a857e07665b7423b40cb8cbfd1ad90a1c266491162f6f22b09d6ae96e752df6625475b5459e3f03a43802fe8731764805afa10854f5657ecd"

RPROVIDES:${PN} += "csindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
