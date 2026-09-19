SUMMARY = "Key-value parsing combining features of xkeyval and pgfkeys"
DESCRIPTION = "The package integrates the features of xkeyval and of pgfkeys \
by introducing a new type of handlers. Style keys, links, \
changing key callbacks and values on the fly, and other \
features of pgfkeys are introduced in a new context."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn30560"

RPM_NAME = "texlive-skeyval-2026.226.1.3svn30560-64.2.noarch.rpm"
RPM_HASH = "26fff048c579d037d143d9f02d7f16886083d3bdf42b37cff073dccdf4b3900aede9e5db538445be558c32b9a58042b1992b2ee9fc13abe6fe760619bdcc7f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skeyval-bc.sty \
tex-skeyval-core.tex \
tex-skeyval-for.tex \
tex-skeyval-ltxcmds.tex \
tex-skeyval-ltxpatch.sty \
tex-skeyval-pstkey.sty \
tex-skeyval-pstkey.tex \
tex-skeyval-testclass.cls \
tex-skeyval-testpkg.sty \
tex-skeyval-view.sty \
tex-skeyval.sty \
texlive-skeyval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-atveryend.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-pifont.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
