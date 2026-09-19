SUMMARY = "Typesetting Z and CSP format specifications"
DESCRIPTION = "The package supports real-time CSP and incorporates the \
functionality of Spivey's original Z package, written for LaTeX \
2.09."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17258"

RPM_NAME = "texlive-zed-csp-2026.226.svn17258-59.4.noarch.rpm"
RPM_HASH = "87f069879d5740c421e61b64a8a8d0283c41babf8bd4f7fbe4f9ead62e78b31052636d1bd8afe2e18d5a60ddadaadb3f304b93a8affd113a494d0c95378d8a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zed-csp.sty \
texlive-zed-csp"

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
