SUMMARY = "Documentation for texlive-biblatex-realauthor"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-realauthor"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7.1asvn45865"

RPM_NAME = "texlive-biblatex-realauthor-doc-2026.226.2.7.1asvn45865-61.2.noarch.rpm"
RPM_HASH = "0a9f298be17f9c157b1b730029a75c7bfc62289d9c3c6a883d077e3840b739fb3359bc6199c01c69bf212e1db4ecbb4b56f3f01df35da4ab089ff7cc8f96464f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-realauthor-doc"

RDEPENDS:${PN} += ""

inherit rpm
