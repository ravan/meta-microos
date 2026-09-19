SUMMARY = "Documentation for texlive-letgut"
DESCRIPTION = "This package includes the documentation for texlive-letgut"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.14svn77945"

RPM_NAME = "texlive-letgut-doc-2026.226.0.0.9.14svn77945-61.2.noarch.rpm"
RPM_HASH = "830e54fc1313af0cde5c82bbfac13acf9cce88eaf20dda2cd813f309459f7c6907d957d644106aeadad9a73a84470619a069f5dd0eb5e72e6783f92b777655a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-letgut-doc"

RDEPENDS:${PN} += ""

inherit rpm
