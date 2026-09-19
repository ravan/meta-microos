SUMMARY = "Utilities to export events from Windows XML event files (EVTX)"
DESCRIPTION = "Tools for parsing EVTX files. These include evtxinfo and evtxexport."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libevtx-tools-20260705-1.2.aarch64.rpm"
RPM_HASH = "7372c80edfc871559632b55a0ae3f8319f3e4ee22ad3ae8178158573722ca2e764e87f4457318b577f2c865de160b2db9207f7195b7a583e7ff0296b6e6c818e"

RPROVIDES:${PN} += "libevtx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdirectory.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcsplit.so.1 \
libevtx.so.1 \
libexe.so.1 \
libfcache.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwevt.so.1 \
libregf.so.1 \
libwrc.so.1"

inherit rpm
