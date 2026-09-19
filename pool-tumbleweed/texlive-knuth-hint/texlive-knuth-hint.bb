SUMMARY = "HINT collection of typeset C/WEB sources in TeX Live"
DESCRIPTION = "The knuth-hint package contains the large collection of HINT \
documents for many of the CWEB amd WEB sources of programs in \
the TeX Live distribution (and, for technical reasons, a PDF \
document for XeTeX). Each program is presented in its original \
form as written by the respective authors, and in the 'changed' \
form as used in TeX Live. Care has been taken to keep the \
section numbering intact, so that you can study the codes and \
the changes in parallel. Also included are the 'errata' for \
Donald Knuth's 'Computers & Typesetting'. HINT is the dynamic \
document format created by Martin Ruckert's HiTeX engine that \
was added to TeX Live 2022. The HINT files can be viewed on \
Linux, Windows, and Android with the hintview application. The \
knuth-hint package is a showcase of HiTeX's capabilities."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.6svn74654"

RPM_NAME = "texlive-knuth-hint-2026.226.2.6svn74654-63.2.noarch.rpm"
RPM_HASH = "c5284c6581005558e5d8d4b17f0642552ba73b9d1bfe32cdc830f4660c3b0324f538c63c5cd81728f357af219a427a5ab07c8111f4d9d3765c829da29e11cf9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knuth-hint"

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
