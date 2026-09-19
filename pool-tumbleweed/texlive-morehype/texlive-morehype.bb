SUMMARY = "Hypertext tools for use with LaTeX"
DESCRIPTION = "The bundle provides three packages: texlinks: shorthand macros \
for TeX-related external hyperlinks with hyperref, the blog \
package in the present bundle, etc; hypertoc: adjust the \
presentation of coloured frames in hyperref tables of contents \
(article class only); blog: fast generation of simple HTML by \
expanding LaTeX macros, using the fifinddo package."
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.83svn38815"

RPM_NAME = "texlive-morehype-2026.226.r0.83svn38815-61.2.noarch.rpm"
RPM_HASH = "49f13d8b15775940729ce2d4e4d1e089b9d9905ce9c95bc4420789586e0fd4db56f737cde8eae974396deb838bbe013670fa4d4e6c13e99569b807d3fb462f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blog.sty \
tex-blogdot.cfg \
tex-blogdot.sty \
tex-blogexec.sty \
tex-blogligs.sty \
tex-hypertoc.sty \
tex-lnavicol.sty \
tex-markblog.sty \
tex-texlinks.sty \
texlive-morehype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-domore.sty \
tex-dowith.sty \
tex-fifinddo.sty \
tex-langcode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
