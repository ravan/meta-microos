SUMMARY = "How to draw technical diagrams with MetaPost"
DESCRIPTION = "This project provides a document that discusses how to draw \
technical diagrams with John Hobby's MetaPost language. It \
includes over 200 illustrations created with MetaPost, complete \
with source code as inspiration and examples."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn72705"

RPM_NAME = "texlive-drawing-with-metapost-2026.226.2.0svn72705-59.2.noarch.rpm"
RPM_HASH = "81284e8cb0e7195fb3c523ad48b16a486b7ba9268c7f59fa4aaa853ddaba953e4b74bd98008645e3eadb1b9281c9f2bd90f27d4bfa871130a017255c5c08bcc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drawing-with-metapost"

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
