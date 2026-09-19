SUMMARY = "LaTeX maths without backslashes"
DESCRIPTION = "This package allows for the omission of backslashes from most \
math mode commands. Specifically, any consecutive string of at \
least two (Latin) letters appearing in math mode will \
automatically be turned into the control sequence with the same \
name, if it exists. The package provides the \\freemathon and \
\\freemathoff commands which respectively activate and \
deactivate this behaviour. It is disabled by default upon \
loading. Regular commands initiated by a backslash may of \
course still be used when freemath is active, and can \
furthermore be freely mixed with backslash-free commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76930"

RPM_NAME = "texlive-freemath-2026.226.1.1svn76930-60.2.noarch.rpm"
RPM_HASH = "be64cf0f9a9ca7fcc84d9883ed942d398282708f47c6a306fdc2edffb23313aada000b568cafa766532399914c75f7c40ddeb07e73385aaf47aa60185ad69570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-freemath.sty \
texlive-freemath"

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
