SUMMARY = "LaTeX packages that aid in creating CVs based on the komacv class and creating related documents"
DESCRIPTION = "The komacv-rg bundle provides packages that aid in creating CVs \
based on the komacv class and creating related documents, such \
as cover letters and cover sheets for job applications. \
Concretely, the bundle consists of three packages: \
komacv-addons, komacv-lco, and komacv-multilang. komacv-addons \
is a small collection of add-ons and fixes for the komacv \
class; komacv-lco enables the use of letter class options from \
scrlttr2 also in komacv-based and other non-scrlttr2-based \
documents; komacv-multilang enables the provisioning of CVs in \
multiple languages and the selection of a language via babel or \
polyglossia."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.2svn49064"

RPM_NAME = "texlive-komacv-rg-2026.226.0.0.9.2svn49064-63.2.noarch.rpm"
RPM_HASH = "6bfec8b6a94e4d6f70cea251f9e423b80dafff244d9e159e5df3610a2d93b2a91e3df0e8ddb7661a3ba37f51d9bd5c35e3480e439548ae58b0de8d3d227834ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-komacv-addons.sty \
tex-komacv-lco.sty \
tex-komacv-multilang.sty \
texlive-komacv-rg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime2-calc.sty \
tex-datetime2.sty \
tex-etoolbox.sty \
tex-fontawesome.sty \
tex-letltxmacro.sty \
tex-marvosym.sty \
tex-multilang-sect.sty \
tex-multilang-tags.sty \
tex-multilang.sty \
tex-scrkbase.sty \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
