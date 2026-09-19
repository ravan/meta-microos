SUMMARY = "Library and header file for the interface of a2ps"
DESCRIPTION = "a2ps converts ASCII text into PostScript. This feature is used by \
apsfilter, for example, to pretty-print ASCII text. \
 \
Warning: a2ps is not able to convert complex Unicode (UTF-8) text to \
PostScript.  Only language text which can be converted from UTF-8 to \
Latin encodings are supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.8"

RPM_NAME = "a2ps-devel-4.15.8-1.1.aarch64.rpm"
RPM_HASH = "d9175f717a43c329ace3d8f0783493d4c8eb31eb0edc7cbe43dcc710c3966d3dc25aa65937f119674ee25e65b27b323d10d2bb79cdebe6b19242d15b14d4ba4b"

RPROVIDES:${PN} += "a2ps-devel"

RDEPENDS:${PN} += "glibc-devel \
liba2ps1"

inherit rpm
