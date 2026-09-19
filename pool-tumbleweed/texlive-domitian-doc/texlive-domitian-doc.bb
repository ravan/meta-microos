SUMMARY = "Documentation for texlive-domitian"
DESCRIPTION = "This package includes the documentation for texlive-domitian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn77682"

RPM_NAME = "texlive-domitian-doc-2026.226.1.0.1svn77682-59.2.noarch.rpm"
RPM_HASH = "80fbf072e2b30938a837e69806d7d67d9e5dbc37c9d2ccb42e1a1e5ea50dfaef9cf98d70a2426d2895e4dbc408ff2cb0981ef676310771985d17b1bd7ca042ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-domitian-doc"

RDEPENDS:${PN} += ""

inherit rpm
