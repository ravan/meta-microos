SUMMARY = "Name authority mechanism for consistency in body text and index"
DESCRIPTION = "Publications that reference many names require editors and \
proofreaders to track those names in text and index. The \
package offers name authority macros that allow authors and \
compilers to normalize occurrences of names, variant name \
forms, and pen names in text and index. This may help minimize \
writing and production time and cost."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2svn76172"

RPM_NAME = "texlive-nameauth-2026.226.4.2svn76172-61.2.noarch.rpm"
RPM_HASH = "018ccefafc2f20ff98915314c57bf41f694514dca642a3cea27593da2c4445c6e88418e8ce70c2a8eacc37e023a700d478ed4215b0023310ada4890a4b4ce388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nameauth.sty \
texlive-nameauth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-suffix.sty \
tex-trimspaces.sty \
tex-xargs.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
