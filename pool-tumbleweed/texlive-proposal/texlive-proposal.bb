SUMMARY = "A set of LaTeX classes for preparing proposals for collaborative projects"
DESCRIPTION = "The process of preparing a collaborative proposal, to a major \
funding body, involves integration of contributions of a many \
people at many sites. It is therefore an ideal application for \
a text-based document preparation system such as LaTeX, in \
concert with a distributed version control system such as SVN. \
The proposal class itself provides a basis for such an \
enterprise. The dfgproposal and dfgproposal classes provide two \
specialisations of the base class for (respectively) German and \
European research proposals. The packages depend on the \
author's stex bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn40538"

RPM_NAME = "texlive-proposal-2026.226.svn40538-59.2.noarch.rpm"
RPM_HASH = "eef0f3de6c884927ed62ef6b9e1348057aa2c4860c91e8c98fe11d3449394423ad2dad72b2f32bd5dc48c19090d0f71bc49694b2598da121710ed9bd02947173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dfgpdata.sty \
tex-dfgproposal.cls \
tex-dfgreporting.cls \
tex-eupdata.sty \
tex-euproposal.cls \
tex-eureporting.cls \
tex-pdata.sty \
tex-proposal.cls \
tex-reporting.cls \
texlive-proposal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-boxedminipage.sty \
tex-chngcntr.sty \
tex-colortbl.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-ed.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-gitinfo2.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-longtable.sty \
tex-mdframed.sty \
tex-paralist.sty \
tex-rotating.sty \
tex-svninfo.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-url.sty \
tex-wasysym.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
