SUMMARY = "Utilities to inspect Common Log File Systems"
DESCRIPTION = "This subpackage provides the utilities from libfsclfs, which allows for \
reading Common Log File Systems (CLFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20240430"

RPM_NAME = "libfsclfs-tools-20240430-1.21.aarch64.rpm"
RPM_HASH = "3e6d13483a39b8eec69183d0f2ac1692adc9433bf3b0dabaa0b06ba542edf9b2ce5792ad4293daf46db02c42f46d5a3ccce9b1844ce3a5a2272d0a40598b007b"

RPROVIDES:${PN} += "libfsclfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfsclfs.so.1 \
libftxf.so.1 \
libftxr.so.1"

inherit rpm
