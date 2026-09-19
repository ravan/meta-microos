SUMMARY = "Documentation for texlive-domaincoloring"
DESCRIPTION = "This package includes the documentation for texlive-domaincoloring"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.05svn72176"

RPM_NAME = "texlive-domaincoloring-doc-2026.226.0.0.05svn72176-59.2.noarch.rpm"
RPM_HASH = "08d5da6063eee60826fd0b0710b21f91c8499c999bbb54bfa6dd897d019494c956818b5a0c5a39ab19b0c7bfabe465ebccd4973abb568eaa502de7ab57f539f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-domaincoloring-doc-de \
texlive-domaincoloring-doc"

RDEPENDS:${PN} += ""

inherit rpm
