SUMMARY = "Add special material to footer of title page"
DESCRIPTION = "Provides the capability of adding keywords (with a \\keywords \
command), a running title (\\runningtitle), AMS subject \
classifications (\\amssubj), and an 'author's footnote' as \
footnotes to the title or first page of a document. Works with \
any class for which the \\thanks macro works (e.g., article)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-titlefoot-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "80614c3c231b40eaa81a6e5707e2986206f4b68918856e3062ddf43cd54032d09fbe5eaea8d42574ffcc90e7ffec9e88e5acc3c5ab89c41ecbb5ec45b38c45eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titlefoot.sty \
texlive-titlefoot"

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
