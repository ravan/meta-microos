SUMMARY = "Backup program with deduplication and encryption"
DESCRIPTION = "velero is a backup program. It supports verification, encryption, \
snapshots and deduplication."
LICENSE = "Apache-2.0"

PV = "1.18.2"

RPM_NAME = "velero-1.18.2-1.3.aarch64.rpm"
RPM_HASH = "cfac924f026e5bcc94e17daffd0b1f5ae9d0b0b61cfd9e58aa82ef9f4aa282eac1f83dc4ae66e4fb18a0cbce89151c464c4a9b12e0fedd4e11582fa7e151dd1d"

RPROVIDES:${PN} += "velero"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
