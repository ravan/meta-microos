SUMMARY = "Library for plist formats"
DESCRIPTION = "libfplist is a library for Apple plist formats. In the macOS, iOS, \
NeXTSTEP, and GNUstep programming frameworks, property list files are \
files that store serialized objects. Property lists are also used for \
localization strings for development. \
 \
Part of the libyal family of libraries. \
 \
Read-only supported formats: \
 \
* XML plist format \
 \
Unsupported formats: \
 \
* ASCII plist format \
* Binary plist format"
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfplist1-20260521-1.4.aarch64.rpm"
RPM_HASH = "8e847b16b4ab0f9ba69d3f2da6f042d7c100de4930aaf96aee7ab4d9cd7e7b9942ec07cc369285e18345acaad362c4c45bb19a4133df80f212cdd84f629dacd4"

RPROVIDES:${PN} += "libfplist.so.1 \
libfplist1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libfguid.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
