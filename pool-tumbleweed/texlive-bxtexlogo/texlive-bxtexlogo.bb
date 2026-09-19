SUMMARY = "Additional TeX-family logos"
DESCRIPTION = "The hologo package provides many useful logos of popular (and \
not so popular) TeX-family software. However, its interface is \
a bit cumbersome because you must type \\hologo{BibTeX} instead \
of \\BibTeX. This package makes it possible to import some of \
the logos provided by hologo as single commands, such as \
\\BibTeX. Additionally, the package provides logos of some \
TeX-family software that is popular mainly in Japan. These \
logos can be imported in the same way as those provided by the \
\\hologo command. bxtexlogo depends on hologo and cjhebrew (if \
\\logoAleph and \\logoLamed are used)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn63231"

RPM_NAME = "texlive-bxtexlogo-2026.226.0.0.6svn63231-59.2.noarch.rpm"
RPM_HASH = "5b8b84b37e709659a6e359d30a9fc8fa52c6770900b6d512747117cbba58f0bab658ac8da7aa159c2d270e9c52710fe594a34183019075f1993e158c2edad54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxtexlogo.sty \
texlive-bxtexlogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hologo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
