SUMMARY = "CWEB for ANSI-C/C++ compilers"
DESCRIPTION = "A highly portable and extended version of Levy/Knuth CWEB 3.64c \
for UNIX, Windows, Mac (and possibly other operating systems). \
TeX macros, CWEB macros, and NLS catalogs are included for \
German, French (partially), and Italian program documentation \
on any machine. Major features: Thoroughly updated code base; \
several bug fixes; clean compilation (with both C and TeX) on \
at least four different architectures. Added CTWILL program \
with tools and utilities for brave users; including \
introductory manpage. Internationalization of CTANGLE, CWEAVE, \
and CTWILL with 'GNU gettext utilities'. New code base for CWEB \
in TeX Live 2019, incorporating all features of the TL 2018 \
version and adding new features from CWEBbin. As of November \
2019 CTAN no longer holds a copy of this material. Please go to \
the package's github repository for more information."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-cweb-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "7ae360798d7b37233760adcc762aecdd76c66eff5a010111d2d710a52a38af9b08446c7ff8fdd53a9a5c51806889c8d47177d26709a08f707b3d759e3c1abb07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Xcwebmac.tex \
tex-ctproofmac.tex \
tex-cttwinxmac.tex \
tex-ctwimac.tex \
tex-cweb-ecma94.sty \
tex-cweb-hp8.sty \
tex-cweb-mac8.sty \
tex-cweb-pc850.sty \
tex-cwebacromac.tex \
tex-cwebmac.tex \
tex-dctproofmac.tex \
tex-dctwimac.tex \
tex-dcwebmac.tex \
tex-dcwebstrings.tex \
tex-fcwebmac.tex \
tex-icwebmac.tex \
tex-pdfctproofmac.tex \
tex-pdfctwimac.tex \
tex-pdfwebtocfront.tex \
tex-twimac-web.tex \
tex-twinx-startup.tex \
texlive-cweb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cweb-bin \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
