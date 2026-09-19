SUMMARY = "Documentation for texlive-pst-ovl"
DESCRIPTION = "This package includes the documentation for texlive-pst-ovl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07bsvn77682"

RPM_NAME = "texlive-pst-ovl-doc-2026.226.0.0.07bsvn77682-59.2.noarch.rpm"
RPM_HASH = "eb341c1f2c4ae0618431061ebb17a0537500c3241973699582be1457a42ba7bd23c77ec842e82b6ebb300a67cc7b934a892bf0f5fc195198259fce1b7148e0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ovl-doc"

RDEPENDS:${PN} += ""

inherit rpm
