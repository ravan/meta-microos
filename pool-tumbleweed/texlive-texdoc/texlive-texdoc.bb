SUMMARY = "Documentation access for TeX Live"
DESCRIPTION = "texdoc is a Lua script providing easy access to the \
documentation in TeX Live: PDF, DVI, plain text files, and \
more. Viewing and other configuration can be extensively \
customized. It is distributed with TeX Live; MiKTeX provides a \
program by the same name to do the same job, but its \
implementation is unrelated."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.4.1.1svn73876"

RPM_NAME = "texlive-texdoc-2026.227.4.1.1svn73876-62.2.noarch.rpm"
RPM_HASH = "9625821b00fdfd14933c2b300b003ff398d37f557bd6b43631fef7d93eca37bbd40bc35323206529d659fb45d14873241481a22457e2489917d37692b66ce0ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdoc.cnf \
texlive-texdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
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
texlive-scripts-bin \
texlive-texdoc-bin"

inherit rpm
