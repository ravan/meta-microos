SUMMARY = "Documentation for texlive-etoolbox-generic"
DESCRIPTION = "This package includes the documentation for texlive-etoolbox-generic"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5ksvn68513"

RPM_NAME = "texlive-etoolbox-generic-doc-2026.226.2.5ksvn68513-59.2.noarch.rpm"
RPM_HASH = "b538cb9ed637e2b3ed4f4f971ed04e9380892ba58c42aec9d3ffef5799c5349e4333e95b4e3975da51b07337f8468062cf748a22b37dec10e5dedac3830d5d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoolbox-generic-doc"

RDEPENDS:${PN} += ""

inherit rpm
