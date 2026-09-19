SUMMARY = "A LaTeX class for theses published with KIT Scientific Publishing"
DESCRIPTION = "This package provides a LaTeX class intended for authors who \
want to publish their thesis or other scientific work with KIT \
Scientific Publishing (KSP). The class is based on the scrbook \
class of the KOMA-script bundle in combination with the \
ClassicThesis and ArsClassica packages. It modifies some of the \
layout and style definitions of these packages in order to \
provide a document layout that should be compatible with the \
requirements by KSP."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn39080"

RPM_NAME = "texlive-ksp-thesis-2026.226.1.0.2svn39080-63.2.noarch.rpm"
RPM_HASH = "6383121e47e776d2b8f4c6052554bf4b39dd1fb20249e04f031f89f35591cd890dabe465b15eed38e51c6c73f783d6a40526ff1ba0081ca463791bea3fdfc5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ksp-thesis.cls \
texlive-ksp-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arsclassica.sty \
tex-classicthesis.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ragged2e.sty \
tex-scrbook.cls \
tex-scrlayer-scrpage.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
