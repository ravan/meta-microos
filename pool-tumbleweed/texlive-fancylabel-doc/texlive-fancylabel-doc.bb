SUMMARY = "Documentation for texlive-fancylabel"
DESCRIPTION = "This package includes the documentation for texlive-fancylabel"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn46736"

RPM_NAME = "texlive-fancylabel-doc-2026.226.1.1svn46736-59.2.noarch.rpm"
RPM_HASH = "fb1e4fff112193491fbec59f11975627433a3cb21fa2503cb72f9d207748a9a41d71c7f061ecd3aae9638b0bdea389a06f3ed97ee7df80ddedd54c38c7a4303f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancylabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
