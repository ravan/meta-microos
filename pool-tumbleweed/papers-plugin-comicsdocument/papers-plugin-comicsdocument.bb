SUMMARY = "Comics document support for Papers"
DESCRIPTION = "A plugin for Papers to read Comics documents."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "papers-plugin-comicsdocument-50.3-1.1.aarch64.rpm"
RPM_HASH = "ed3543a70105d707e28dce6870ceb93b764e21938d798b22397633a4ec3d1bcc76af16ef926794d32b56de4466c573e00d7c1bfec5ca6bcf3e40ce5a4653eda2"

RPROVIDES:${PN} += "libcomicsdocument.so \
papers-plugin-comicsdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libppsdocument-4.0.so.6 \
papers"

inherit rpm
