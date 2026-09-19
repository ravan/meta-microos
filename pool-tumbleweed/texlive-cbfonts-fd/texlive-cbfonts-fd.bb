SUMMARY = "LaTeX font description files for the CB Greek fonts"
DESCRIPTION = "The package provides font description files for all the many \
shapes available from the cbfonts collection. The files provide \
the means whereby the NFSS knows which fonts a LaTeX user is \
requesting. The package depends on cbgreek-complete."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn54080"

RPM_NAME = "texlive-cbfonts-fd-2026.226.1.2svn54080-59.2.noarch.rpm"
RPM_HASH = "860138974df26616c9977f18a8053037b20743cb3a2658a16fa7606cf9f002117dbdabc552542e8c5c1c29fbdaae3ca77050b89c8fb2d69921bc3e4ed7a278f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lgrcmr.fd \
tex-lgrcmro.fd \
tex-lgrcmss.fd \
tex-lgrcmtt.fd \
tex-lgrlcmss.fd \
tex-lgrlcmtt.fd \
tex-lgrlmr.fd \
tex-lgrlmro.fd \
tex-lgrlmss.fd \
tex-lgrlmtt.fd \
texlive-cbfonts-fd"

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
