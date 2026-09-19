SUMMARY = "Allows selected environments to be included/excluded"
DESCRIPTION = "The package defines an environment that only typesets specified \
environments within its scope. So, for example, if you want \
nothing but the figure and table environments in your document, \
you can enclose the whole document with an xcomment environment \
that excludes everything but. This is a lot easier than \
excluding the chunks of text between the environments you want, \
or creating an entire document containing only those \
environments. The package was previously part of the seminar \
bundle for typesetting presentations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.40svn77682"

RPM_NAME = "texlive-xcomment-2026.226.1.40svn77682-59.4.noarch.rpm"
RPM_HASH = "009f01912d5db2470e69726812cbd307efa9a55361692eb68d11496e56afc70f1a6084f016b762d07e0914483b08c6c3c93aa6c232376a6c3c59b779e764516a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcomment.sty \
texlive-xcomment"

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
