SUMMARY = "Atril thumbnailer extension for Caja"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript. \
 \
This package contains the Atril extension for the Caja file manager."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "atril-thumbnailer-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "f277bcdb309d8fa2413ad6b70c3f717117f63b2b887f9aa6c4606f1cb9dcb8f56c8db7e7b437a80edee3105bf1e8cee90e412dc65980d71f6e3a5566da998bbc"

RPROVIDES:${PN} += "atril-thumbnailer"

RDEPENDS:${PN} += "atril \
caja"

inherit rpm
