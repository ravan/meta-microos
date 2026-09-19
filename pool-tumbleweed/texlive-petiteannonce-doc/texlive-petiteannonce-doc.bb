SUMMARY = "Documentation for texlive-petiteannonce"
DESCRIPTION = "This package includes the documentation for texlive-petiteannonce"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0001svn25915"

RPM_NAME = "texlive-petiteannonce-doc-2026.226.1.0001svn25915-58.2.noarch.rpm"
RPM_HASH = "53ca5d2823b6ad1fc13eeedcb407c48a5f0caac5539fa6d5406ae6dbb41267ef3463a36f65c6abf3babafaf8ee7234cc79eb6b99ae60eacf2a759a3b518cb2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-petiteannonce-doc"

RDEPENDS:${PN} += ""

inherit rpm
