SUMMARY = "Utilities to inspect Windows REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libregf-tools-20260526-1.10.aarch64.rpm"
RPM_HASH = "6af648156430b8fbd37ddb881e74dd91a3ce4f0e5439d3401dfde8e8c744590098046dae54c9b472ab60dceef68bfc22fbaeb8dec3f070e0e554e74b17c57eef"

RPROVIDES:${PN} += "libregf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfuse3.so.4 \
libregf.so.1 \
libuna.so.1"

inherit rpm
