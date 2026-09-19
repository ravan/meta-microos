SUMMARY = "Make a format containing a document's preamble"
DESCRIPTION = "The file mylatex.ltx permits you to create a format that \
pre-loads a set of package files (and/or other macros) that you \
regularly use. In some circumstances, this can be a great \
advantage (though on an ordinarily fast modern computer on the \
desktop, gains will be limited). The general scheme is to \
initialize your usage by a command of the form: latex -ini \
mylatex.ltx <document> whick will create a format file \
mylatex.fmt, which you then use as: latex -fmt=mylatex \
<document>"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77050"

RPM_NAME = "texlive-mylatex-2026.226.svn77050-61.2.noarch.rpm"
RPM_HASH = "a5e86e9308452b816141758258b16dee0bb47e2dd3337641ad27f941c668a59583c07e6e2b91eb7392f36e06a45a8dd0841073a6ba871622a3dd1a94108641cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatex"

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
