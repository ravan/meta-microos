SUMMARY = "PDF collection of typeset C/WEB sources in TeX Live"
DESCRIPTION = "Here you find a large collection of PDF documents for many \
C/WEB programs in TeX Live, both in their original form as \
written by their respective authors, and in the changed form as \
they are actually used in the TeX Live system. Care has been \
taken to keep the section numbering intact, so that you can \
study the sources and their changes in parallel. Also included \
is the collection of 'errata' for Donald Knuth's 'Computers & \
Typesetting series'. Although not all the texts here are \
written or maintained by Donald Knuth, it is more convenient \
for everything to be collected in one place for reading and \
searching. They all stem from the system that Knuth created. \
The central entry point is the 'index' file, with links to the \
individual documents, either in HTML or in PDF format."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.6svn74653"

RPM_NAME = "texlive-knuth-pdf-2026.226.2.6svn74653-63.2.noarch.rpm"
RPM_HASH = "ac73328521ddad860a157bf6c0ee72d1a9c3bc0e63a1c9e11768b184fbcbd764555ff917284100b3e1833a965b4915bc1a626b1f72af947defe61d37bbd83686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knuth-pdf"

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
