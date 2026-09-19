SUMMARY = "Full featured font file preview application for GTK+ Desktop Environments"
DESCRIPTION = "This package contains the font-viewer component of font-manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "font-viewer-0.9.4-2.2.aarch64.rpm"
RPM_HASH = "d938d8fc1abfbb7b911603fcbc926edb030a6facd081066daebea87368b70c2c4c9d0928c899f276e4abe173ee7967b24ae17ef3ad7e88f332f522928ed7a504"

RPROVIDES:${PN} += "font-viewer"

RDEPENDS:${PN} += "font-manager-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
