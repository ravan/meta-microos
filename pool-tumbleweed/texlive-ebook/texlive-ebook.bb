SUMMARY = "Helps creating an ebook by providing an ebook class"
DESCRIPTION = "The package defines a command \\ebook that defines page layout, \
fonts, and font-sizes for documents to be rendered as \
PDF-ebooks on small ebook-readers. The package has been tested \
with Kindle e-ink and iPad mini."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn29466"

RPM_NAME = "texlive-ebook-2026.226.svn29466-61.4.noarch.rpm"
RPM_HASH = "e99741c74f8e97fb42f6275c09eb4a8babeb319776a87934befec158d0e803da8cc184b673f062431c7e6d11e931e9947369587956fcc32f7a2dc378005c73ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebook.sty \
texlive-ebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-hyperref.sty \
tex-moreverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
