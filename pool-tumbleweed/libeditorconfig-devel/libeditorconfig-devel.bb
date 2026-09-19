SUMMARY = "Development files for EditorConfig core library written in C"
DESCRIPTION = " \
EditorConfig makes it easy to maintain the correct coding style when switching \
between different text editors and between different projects. The EditorConfig \
project maintains a file format and plugins for various text editors which allow \
this file format to be read and used by those editors. For information on the \
file format and supported text editors, see the EditorConfig website. \
 \
This package contains files for developing and building with editorconfig-core-c"
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.12.11"

RPM_NAME = "libeditorconfig-devel-0.12.11-1.3.aarch64.rpm"
RPM_HASH = "7e9bb56e949869492c69acf75d2685c99f44e69fb7636540e93cbceff42a368721c5c9a446cc80c9e81b157a476e8d5afa14b7e0da057208b8246f42041e080b"

RPROVIDES:${PN} += "cmake-EditorConfig \
libeditorconfig-devel \
pkgconfig-editorconfig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeditorconfig0"

inherit rpm
