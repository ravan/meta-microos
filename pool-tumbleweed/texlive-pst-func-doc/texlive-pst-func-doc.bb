SUMMARY = "Documentation for texlive-pst-func"
DESCRIPTION = "This package includes the documentation for texlive-pst-func"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02asvn77682"

RPM_NAME = "texlive-pst-func-doc-2026.226.1.02asvn77682-59.2.noarch.rpm"
RPM_HASH = "481343e6d14a05a14dc8f775e820dfd3a987e1c04d3174b509a46e3ee4fcc0c04e9c41f9d5dcb17609007d050c725a26e230754cfa33d6ad05767effc8e13bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-func-doc"

RDEPENDS:${PN} += ""

inherit rpm
