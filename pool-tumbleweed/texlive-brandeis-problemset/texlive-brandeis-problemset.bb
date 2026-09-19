SUMMARY = "Document class for COSI Problem sets at Brandeis University (Waltham, MA)"
DESCRIPTION = "Brandeis University's computer science ('COSI') courses often \
assign 'problem sets' which require fairly rigorous formatting. \
This document class, which extends article, provides a simple \
way to typeset these problem sets in LaTeX. Although the class \
is compatible with all LaTeX flavors, XeLaTeX or LuaLaTeX are \
recommended for fontspec support."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.5svn50991"

RPM_NAME = "texlive-brandeis-problemset-2026.226.0.0.5.5svn50991-59.2.noarch.rpm"
RPM_HASH = "234cd91b03b39387558ccb135b46f8e9d272b219caae9ed06218b4903f4e1e97916094530b4e449733ca260039b9e1d42bb54f674588fd12a79e5f1b5757cd29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brandeis-problemset.cls \
tex-brandeis-problemset.sty \
texlive-brandeis-problemset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-changepage.sty \
tex-comment.sty \
tex-couriers.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-fp.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mathtools.sty \
tex-multirow.sty \
tex-stix2.sty \
tex-tabu.sty \
tex-tikz.sty \
tex-titletoc.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
