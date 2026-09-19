SUMMARY = "A generic template for graduate student resumes"
DESCRIPTION = "The package offers a template for graduate students writing an \
academic CV. The goal is to create a flexible template that can \
be customized based on each specific individual's needs."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38832"

RPM_NAME = "texlive-gradstudentresume-2026.226.svn38832-60.4.noarch.rpm"
RPM_HASH = "ebf54815ed6d5c126b6aef82430583184b3d487cb06bcf97080a834e8409bca94e4196decb20f2461d6a32139b6bc8200a310143c121e167396808565f19bdc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gradstudentresume.cls \
texlive-gradstudentresume"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anysize.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
