SUMMARY = "Documentation for texlive-einfart"
DESCRIPTION = "This package includes the documentation for texlive-einfart"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-einfart-doc-2026.226.svn78004-61.4.noarch.rpm"
RPM_HASH = "c9b7b1bf50b738acaf5eb3eca28868308ba7e5f911ac236974924877356f0c142b7e5c8f1282ea1054c8f2bb2b04117e98a2b401a3173034ac1611e863bc8697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-einfart-doc"

RDEPENDS:${PN} += ""

inherit rpm
