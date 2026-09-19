SUMMARY = "Alter the format of \\label references"
DESCRIPTION = "LaTeX provides a mechanism for altering the appearance of \
references to labels, but it's somewhat flawed, and requires \
that the user manipulate internal commands. The package solves \
the problem, by providing a \\labelformat command for changing \
the format of references to labels. The package also provides a \
\\Ref command to make reference to such redefined labels at the \
start of a sentence."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-fncylab-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "f16b9c87048f179743f6e7575ff2b613717098615d39b15e2e33b93065167f1b38b920371a20b40f5b787e062e356b8dcaf1837d3d6d07357c8279d8f02d69c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fncylab.sty \
texlive-fncylab"

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
