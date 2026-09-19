SUMMARY = "Automatic equation references"
DESCRIPTION = "The package arranges that equation numbers are applied only to \
those equations that are referenced. This operation is similar \
to the showonlyrefs option of the package mathtools."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.11svn77682"

RPM_NAME = "texlive-autonum-2026.226.0.0.3.11svn77682-60.2.noarch.rpm"
RPM_HASH = "400652b96d66d365402af2956a4c19fc08775510f4b9b82d276621eb05b9b7367e6fe0028b0315155ce1389705c834f8a435320f36c0f9f52455444f873b494c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autonum.sty \
texlive-autonum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etextools.sty \
tex-etoolbox.sty \
tex-letltxmacro.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
