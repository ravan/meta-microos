SUMMARY = "Documentation for texlive-tikzducks"
DESCRIPTION = "This package includes the documentation for texlive-tikzducks"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-tikzducks-doc-2026.226.2.2svn77682-59.2.noarch.rpm"
RPM_HASH = "02fe38785aafe57d0976fb52e6e86b722b621b18a3127375f06ae51b7ff943017f7259abbd6d9b257b354179d717e9538fd4f5f9128961ce4954d28630f1121a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzducks-doc"

RDEPENDS:${PN} += ""

inherit rpm
