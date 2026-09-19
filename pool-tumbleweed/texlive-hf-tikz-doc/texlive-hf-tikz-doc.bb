SUMMARY = "Documentation for texlive-hf-tikz"
DESCRIPTION = "This package includes the documentation for texlive-hf-tikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-doc-2026.226.0.0.3asvn34733-60.4.noarch.rpm"
RPM_HASH = "064e9a5ae90182613c4e99f5ae69b1f1d90729660f17c84036b473c44ad1407a20289b0be0ca9a752ac11bbe253b87fab902b962a975755e1b5de49af790447e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hf-tikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
