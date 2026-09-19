SUMMARY = "Tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Tools to access the Volume Shadow Snapshot (VSS) format. The VSS \
format is used by Windows, as of Vista, to maintain copies of data on \
a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "libvshadow-tools-20260714-1.2.aarch64.rpm"
RPM_HASH = "f36480e2404052f15062b4d1bf53a723c207f2eacd8c991cdb5c5f1bcedb971c3ee900508263e637b0888ec873cbbdd9a72e01833e8b256f90713c1c34a51fa8"

RPROVIDES:${PN} += "libvshadow-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfuse3.so.4 \
libvshadow.so.1"

inherit rpm
