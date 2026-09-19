SUMMARY = "Macros for IEEE conference proceedings"
DESCRIPTION = "The IEEEconf class implements the formatting dictated by the \
IEEE Computer Society Press for conference proceedings."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn59665"

RPM_NAME = "texlive-ieeeconf-2026.226.1.4svn59665-60.2.noarch.rpm"
RPM_HASH = "174d9c352a1e871fecab03f6b7e8d5a08ec3eb25c6ed3cae8ef95768c98963d06a0b35bc25155488453283311d1c6d1cf725b36b1537df0637cf0f35dfdd8f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IEEEconf.cls \
texlive-ieeeconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-courier.sty \
tex-helvet.sty \
tex-mathptmx.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
