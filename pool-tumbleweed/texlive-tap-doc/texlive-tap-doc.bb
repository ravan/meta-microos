SUMMARY = "Documentation for texlive-tap"
DESCRIPTION = "This package includes the documentation for texlive-tap"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.0.0.77svn31731"

RPM_NAME = "texlive-tap-doc-2026.227.0.0.77svn31731-62.2.noarch.rpm"
RPM_HASH = "11ca6d17f042efaa3c53a3c761ac9c22a1e86b056bb18dabc450519fd2124b7e258eb09cccb07e65da248364d681cd9f8c3242e1d9e1aa943372fda8588a7c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tap-doc"

RDEPENDS:${PN} += ""

inherit rpm
