SUMMARY = "Utilities to inspect Windows Hibernation Files"
DESCRIPTION = "This subpackage provides the utilities from libhibr, which allows for \
inspecting Windows Hibernation Files (hiberfil.sys)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr-tools-20210421-3.35.aarch64.rpm"
RPM_HASH = "05d5b939efcc9f4f337e63ea3676be69aa4d10d452d884258cd9d6a87e1b79e8d11ff6cc7d80ea089ff1a78840d6061d2149018f115681ca9873f4284e29c5fb"

RPROVIDES:${PN} += "libhibr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfuse.so.2 \
libhibr.so.1"

inherit rpm
