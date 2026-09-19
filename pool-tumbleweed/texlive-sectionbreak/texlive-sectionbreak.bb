SUMMARY = "LaTeX support for section breaks"
DESCRIPTION = "This package provides LaTeX support for section breaks, used \
mainly in fiction books to signal changes in a story, like \
changes in time, location, etc. It supports the asterism \
symbol, text content, or custom macros as the section break \
mark symbol."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1dsvn77682"

RPM_NAME = "texlive-sectionbreak-2026.226.0.0.1dsvn77682-60.2.noarch.rpm"
RPM_HASH = "a4e29efc566bc58844550ebb0ef1f4cd96b9b59d81ee9bcf0658e4672d6476c3113d02402401d98f284064415c075ab33c816f3011866cddace83c8e202e95f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sectionbreak.sty \
texlive-sectionbreak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
