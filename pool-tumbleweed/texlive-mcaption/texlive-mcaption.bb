SUMMARY = "Put captions in the margin"
DESCRIPTION = "The mcaption package provides an mcaption environment which \
puts figure or table captions in the margin. The package works \
with the standard classes and with the KOMA-Script document \
classes scrartcl, scrreprt and scrbook. The package requires \
the changepage package."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-mcaption-2026.226.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "6177845c55b94b8c0b0b0a81b4715f48886ea484af8d42bb08be6849794c0f1d7c60431b13442627e501830b81ef2b853532721d94f60c820ccda8ab48158afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mcaption.sty \
texlive-mcaption"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-changepage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
