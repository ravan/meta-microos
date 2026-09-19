SUMMARY = "Make author, etc., available after \\maketitle"
DESCRIPTION = "This jiffy package makes the author, title and date of the \
package available to the user (as \\MyAuthor, etc) after the \
\\maketitle command has been executed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55889"

RPM_NAME = "texlive-authoraftertitle-2026.226.1.0svn55889-60.2.noarch.rpm"
RPM_HASH = "61cc5ff0ed7f7dfe8e8239217da583c2b4c551750c7638bec8eca23fdc5aaf9d8259fe5ae638e904f3aeed2a3fabfb631fee4bd220ce1219b8657aa078414d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authoraftertitle.sty \
texlive-authoraftertitle"

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
