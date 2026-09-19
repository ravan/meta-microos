SUMMARY = "A collection of LaTeX API macros"
DESCRIPTION = "This is a bundle of macros that the author uses in the coding \
of others of his macro files."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1asvn24897"

RPM_NAME = "texlive-ltxtools-2026.226.0.0.0.1asvn24897-59.2.noarch.rpm"
RPM_HASH = "ea4f02214ed951773a15d86f2265f1bb2b64418b52e2c1c478e4ea6bc40a2e489c3a15aab9784ecadf9cfa976b82557ffec1d2471f59532d4c4d5112dcdac6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxtools-base.sty \
tex-ltxtools-doc.sty \
tex-ltxtools-environ.sty \
tex-ltxtools-incluput.sty \
tex-ltxtools-index.sty \
tex-ltxtools-review.sty \
tex-ltxtools-trace.sty \
tex-ltxtools.sty \
texlive-ltxtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-catoptions.sty \
tex-fp.sty \
tex-ltxkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
