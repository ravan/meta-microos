SUMMARY = "XZ and lzip filters for nbdkit"
DESCRIPTION = "This package contains the xz and lzip filters for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-xz-filter-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "ddfecaf7c5751846e8ea2f90ef1ae3019bbc355dade8d07b42919674c34dbb26aa990671e1ff79fc5570e9b781c587724101b543d4067b15a16a960229229c7b"

RPROVIDES:${PN} += "nbdkit-xz-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
nbdkit-server"

inherit rpm
