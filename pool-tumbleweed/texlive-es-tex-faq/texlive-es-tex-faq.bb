SUMMARY = "CervanTeX (Spanish TeX Group) FAQ"
DESCRIPTION = "SGML source, converted LaTeX version, and readable copies of \
the FAQ from the Spanish TeX users group."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.97svn15878"

RPM_NAME = "texlive-es-tex-faq-2026.226.1.97svn15878-61.4.noarch.rpm"
RPM_HASH = "95054965dadfbada7af5372fe0cc4ea430ef6691648c5082716481a11c2b84939e0b2215020dde06d77f290f6386bfbe0607d6decf42c69ae0fc93cefea942f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-es-tex-faq"

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
