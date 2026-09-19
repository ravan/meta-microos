SUMMARY = "wxWidgets interface description"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains the interface description in XML format, \
useful for generating bindings."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "wxWidgets-3_2-doc-xml-3.2.8-4.5.noarch.rpm"
RPM_HASH = "16be182ccc01feb8d32bd1f2840cbf3a3d7534a73941417ff6c1df6d1d87ea3aa31912539bdc2dd0d2574e1cc11f7db93f941ab1c60c656b5f70eb7c03bd436f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxWidgets-3-2-doc-xml"

RDEPENDS:${PN} += ""

inherit rpm
