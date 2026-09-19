SUMMARY = "Fix magnification in pdfTeX"
DESCRIPTION = "A recent change to pdfTeX has caused magnification to apply to \
page dimensions. This small package changes the values set in \
the page dimension variables from pt to truept, thus evading \
the effects of \\mag."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-fixpdfmag-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "d0828ca818c22c63d2217cddfa10a2b4dd01df19862fcc00b7686e4d4edf49b3e45cc123ff84b8a68ab290bf21892f1634ce14dde92b0ff394fc9171db707941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixpdfmag.tex \
texlive-fixpdfmag"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
