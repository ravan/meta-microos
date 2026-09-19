SUMMARY = "Utilities to export events from Windows Event Log files"
DESCRIPTION = "Tools for reading Windows Event Log (EVT) files. These include \
evtinfo and evtexport. See evtxtools for Windows XML Event Log (EVTX) \
programs."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libevt-tools-20260705-1.2.aarch64.rpm"
RPM_HASH = "482101f1f7d38d12df05d331cacacc6cf5ad581dba5ef2b6f17469e5fa38bba6ee5d73c9e681025c5b274eaed3c491fa9f17b7b7585733e5b405ac3579ed1086"

RPROVIDES:${PN} += "libevt-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdirectory.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcsplit.so.1 \
libevt.so.1 \
libexe.so.1 \
libfcache.so.1 \
libfdatetime.so.1 \
libfwevt.so.1 \
libregf.so.1 \
libwrc.so.1"

inherit rpm
