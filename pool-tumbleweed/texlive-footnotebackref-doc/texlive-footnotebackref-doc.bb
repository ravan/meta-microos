SUMMARY = "Documentation for texlive-footnotebackref"
DESCRIPTION = "This package includes the documentation for texlive-footnotebackref"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-footnotebackref-doc-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "9783cbc64a5c227bb0898deb686368798202a92ebc646848bdb366b494b3cb7e1733ea26f8858a21a439be0232db2bec8556c5f6a66fa08743121cea8ce9de31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnotebackref-doc"

RDEPENDS:${PN} += ""

inherit rpm
