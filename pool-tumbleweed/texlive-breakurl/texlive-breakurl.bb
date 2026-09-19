SUMMARY = "Line-breakable \\url-like links in hyperref when compiling via dvips/ps2pdf"
DESCRIPTION = "This package provides a command much like hyperref's \\url that \
typesets a URL using a typewriter-like font. However, if the \
dvips driver is being used, the original \\url doesn't allow \
line breaks in the middle of the created link: the link comes \
in one atomic piece. This package allows such line breaks in \
the generated links."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.40svn77682"

RPM_NAME = "texlive-breakurl-2026.226.1.40svn77682-59.2.noarch.rpm"
RPM_HASH = "7ff5f0593e38c257fbbdb7420b62056a81fbf8293eb5217b772270bdc0f58b45540bf2e29cffa2636c24318094d7792d60050d2a3d2efb8044b2e9efd18e918e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breakurl.sty \
texlive-breakurl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
