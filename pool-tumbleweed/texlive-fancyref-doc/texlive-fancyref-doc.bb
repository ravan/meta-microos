SUMMARY = "Documentation for texlive-fancyref"
DESCRIPTION = "This package includes the documentation for texlive-fancyref"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9csvn77682"

RPM_NAME = "texlive-fancyref-doc-2026.226.0.0.9csvn77682-59.2.noarch.rpm"
RPM_HASH = "d6c384ec606fc7c65e3e667701cbcd754ad60c4c1eb7ddd5983dac5864568220f0707e4bee37954ff004347a3c78cfff141324f9cd4815974213e363c70477e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyref-doc"

RDEPENDS:${PN} += ""

inherit rpm
