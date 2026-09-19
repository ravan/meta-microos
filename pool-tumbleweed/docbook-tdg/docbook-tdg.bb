SUMMARY = "DocBook: The Definitive Guide"
DESCRIPTION = "This book is designed to be the clear, concise, normative reference to \
the DocBook DTD. This book is the official documentation for the \
DocBook DTD.  For printed copies, visit http://docbook.org/tdg/en/. \
 \
'Fairly crude PDF versions' (Norman Walsh) of Part I, Part II, and Part \
III are included in this package."
LICENSE = "GFDL-1.1"

PV = "2.0.6"

RPM_NAME = "docbook-tdg-2.0.6-400.24.noarch.rpm"
RPM_HASH = "d3720e5ca42d3738ca1ee1430a18dadb3c12d617b6bc92d20486d8915a6cc5380947c09cb33808ed2e8f9b2e3df621910b7af278b36cbba59599f1936db5762e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-tdg"

RDEPENDS:${PN} += ""

inherit rpm
