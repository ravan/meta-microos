SUMMARY = "LibreLogo scripting language"
DESCRIPTION = "Enables LibreLogo scripting in Writer. LibreLogo is a Logo-like \
programming language with interactive vectorgraphics for education and \
DTP."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-librelogo-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "cd8ec77480eb820e3cdbe72a2f1923a5d78caaf431482885086b6267de9168be952fba1fd9413edaf242602adf47a8afa89a2aa66dc3bbe839ce6d3fbb0d5c63"

RPROVIDES:${PN} += "libreoffice-librelogo"

RDEPENDS:${PN} += "libreoffice-pyuno \
libreoffice-writer"

inherit rpm
