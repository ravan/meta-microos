SUMMARY = "Documentation for texlive-notebeamer"
DESCRIPTION = "This package includes the documentation for texlive-notebeamer"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6asvn77682"

RPM_NAME = "texlive-notebeamer-doc-2026.226.4.6asvn77682-61.2.noarch.rpm"
RPM_HASH = "46094866a76453ad6bda52c601f53cce2df88eb68647185b270e175e65168692b4bcd03d50dae774dffb1832305a0aeab00bc5f3adb6697aa0e913cb3adf01b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notebeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
