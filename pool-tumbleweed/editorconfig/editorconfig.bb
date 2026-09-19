SUMMARY = "Commandline utilities for EditorConfig"
DESCRIPTION = "EditorConfig makes it easy to maintain the correct coding style when switching \
between different text editors and between different projects. The EditorConfig \
project maintains a file format and plugins for various text editors which allow \
this file format to be read and used by those editors. For information on the \
file format and supported text editors, see the EditorConfig website. \
 \
This package contains command line utilities."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.12.11"

RPM_NAME = "editorconfig-0.12.11-1.3.aarch64.rpm"
RPM_HASH = "bac93b644f8f3c3220851d37fb5bbd5bf8628aedb91083e031a7eac83657116307ea7fdec7f6c14cde4c655dca1ddb0646068aa33a6e3a601ca5d3a6f74d9a52"

RPROVIDES:${PN} += "editorconfig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeditorconfig.so.0"

inherit rpm
