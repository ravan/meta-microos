SUMMARY = "Seven predefined chapter heading styles"
DESCRIPTION = "Each style can be modified using a set of simple commands. \
Optionally one can modify the formatting routines in order to \
create additional chapter headings. This package was previously \
known as FancyChapter."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.34svn77682"

RPM_NAME = "texlive-fncychap-2026.226.1.34svn77682-60.2.noarch.rpm"
RPM_HASH = "6028146fe8f3814dd516dc4b775b7b9649edbf4ee9da9d10d24155a29e4a2811e9fae396c07c599cda675da7dddcc2fc8f32a481ae8cd745b3396dc9276e4357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fncychap.sty \
texlive-fncychap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
