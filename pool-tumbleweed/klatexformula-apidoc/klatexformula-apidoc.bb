SUMMARY = "API documentation for KLatexFormula"
DESCRIPTION = "KLatexFormula is a graphical user interface for generating images \
from LaTeX equations. \
 \
This package contains the API documentation of the libraries libklfbackend and \
libklftool which are the different components of klatexformula."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klatexformula-apidoc-4.1.0-1.26.noarch.rpm"
RPM_HASH = "ba77fa834f4853323b7bbb65bcc91ed71262d4dad3f2aef6559ba0691648c032f7857b1e51f0426b797d157d5d6669980d8b2cd5fe2247a146df7382f4ca5e5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klatexformula-apidoc"

RDEPENDS:${PN} += "klatexformula"

inherit rpm
