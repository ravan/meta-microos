SUMMARY = "wxWidgets API documentation"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains the API documentation in HTML format."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "wxWidgets-3_2-doc-html-3.2.8-4.5.noarch.rpm"
RPM_HASH = "8396142d6c9e25455d917c0e9848898f189761848134d5658ef7104be3b1efe0553370958243d8d4c859554830fce1208a40d8acf3a34e6c72e5ce016fc5e364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxWidgets-3-2-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
