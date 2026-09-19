SUMMARY = "A LaTeX class to publish article to ISCRAM conferences"
DESCRIPTION = "LaTeX class to publish article to ISCRAM (International \
Conference on Information Systems for Crisis Response and \
Management)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn45801"

RPM_NAME = "texlive-iscram-2026.226.1.1svn45801-63.2.noarch.rpm"
RPM_HASH = "4f0a0fcdfe0fdeb01c97b8f08d020fa702800677c87aa0f9b3ef8ce5e0df9dc8b063934f8009b51021ac631daaafe9e5386491c9712d218b9dcf3ae1c5905f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iscram.cls \
texlive-iscram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-nowidow.sty \
tex-pgfopts.sty \
tex-titlesec.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
