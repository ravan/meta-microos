SUMMARY = "Converter from OpenDocument Text to plain text"
DESCRIPTION = "odt2txt is a command-line tool which extracts the text out \
of OpenDocument Texts produced by OpenOffice.org, StarOffice, \
KOffice and others. \
 \
odt2txt can also extract text from some file formats similar \
to OpenDocument Text, such as OpenOffice.org XML (*.sxw), \
which was used by OpenOffice.org version 1.x and older StarOffice \
versions. To a lesser extend, odt2txt may be useful to extract \
content from OpenDocument spreadsheets (*.ods) and OpenDocument \
presentations (*.odp)."
LICENSE = "GPL-2.0-only"

PV = "0.5"

RPM_NAME = "odt2txt-0.5-2.11.aarch64.rpm"
RPM_HASH = "111dd239e4ea3769e16e0b2f2e7b4399335f0ab17a35c0aafbb639b237a752f07be6cf91bf0e444fccaacb7b16a98f92fe336bcd02c18ff2890e5bf7dae8471e"

RPROVIDES:${PN} += "odt2txt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
