SUMMARY = "Table of contents with different depths"
DESCRIPTION = "A package to create another table of contents with a different \
depth, useful in large documents where a detailed table of \
contents should be accompanied by a shorter one, giving only a \
general overview of the main topics in the document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-shorttoc-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "273e907bf879b423d376a4c6893e8fa08fbd973f677f003df75c41e5a841f69f1b35579ee7f0b1757519a02cb14b813eaff43451ebcbedc63512b0ba4b6a8fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shorttoc.sty \
texlive-shorttoc"

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
