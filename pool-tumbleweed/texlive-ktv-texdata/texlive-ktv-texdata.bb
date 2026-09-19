SUMMARY = "Extract subsets of documents"
DESCRIPTION = "The package defines an exercice environment which numbers every \
exercise, and a command \\get to extract a collection whose \
argument is a comma-separated set of exercise index numbers. \
While the package was designed for teachers constructing tables \
of exercises, it plainly has more general application."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.05.34svn27369"

RPM_NAME = "texlive-ktv-texdata-2026.226.05.34svn27369-63.2.noarch.rpm"
RPM_HASH = "5983a4d32d8d7c496af0352f36f6339b4d68e76de6958461c4b994852c9c215832edc93edd5bf9ddc325769d5d859275b7e09a91c6a51dff8af131f032dc6fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ktv-buildnum.sty \
tex-ktv-texdata.sty \
texlive-ktv-texdata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
