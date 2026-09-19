SUMMARY = "Simplify typesetting of derivatives"
DESCRIPTION = "The package makes writing derivatives very easy. It offers \
macros for derivatives, partial derivatives and multiple \
derivatives, and allows specification of the point at which the \
value is calculated. Some typographic alternatives may be \
selected by package options"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn21385"

RPM_NAME = "texlive-esdiff-2026.226.1.2svn21385-61.4.noarch.rpm"
RPM_HASH = "ffcb3b86cf3fa189e61be24266150b4eeb246f9e723ce3696a32de715225879f0909d2c9c42807c1226400efc89166a38e3a73a498097432e6fa90ccf8341f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esdiff.sty \
texlive-esdiff"

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
