SUMMARY = "LSP implementation for Qt6"
DESCRIPTION = "The Qt 6 LanguageServer library implements the Language Server Protocol (LSP) \
specification. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-languageserver-devel-static-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a098a67775c5fde937e58482b0e4328aac4ae05d7530fd460de5b96059342583f9a235bc607d9a24c2b3a37e1a2c09b0a39fb6c12a2559f0555b78f0dec9bbdf"

RPROVIDES:${PN} += "cmake-Qt6LanguageServerPrivate \
qt6-languageserver-devel-static \
qt6-languageserver-private-devel"

RDEPENDS:${PN} += "cmake-Qt6JsonRpcPrivate"

inherit rpm
