SUMMARY = "Go LSP protocol language server"
DESCRIPTION = "gopls (pronounced 'Go please') is the official Go language server developed \
by the Go team. It provides IDE features to any LSP-compatible editor."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "0.23.0"

RPM_NAME = "gopls-0.23.0-1.2.aarch64.rpm"
RPM_HASH = "df9d6f6f2c9d7eeba6f437593b10bc82826d54485e24417660bf048170acdf3e043d28a3f034b7b6bd0619f393b9bfd857f2722d973dd18cdc63135bf94f0908"

RPROVIDES:${PN} += "gopls"

RDEPENDS:${PN} += "golang-API \
libc.so.6"

inherit rpm
