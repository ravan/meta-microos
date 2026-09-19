SUMMARY = "Securely redact sensitive information using Lua"
DESCRIPTION = "This package provides simple tools for creating redacted Its \
tools are useful for lawyers, workers in sensitive industries, \
and others who need to easily produce both unrestricted \
versions of documents (for limited, secure release) and \
restricted versions of documents (for general release) \
Redaction is done both by hiding all characters and by slightly \
varying the length of strings to prevent jigsaw identification. \
It also is friendly to screen readers by adding alt-text \
indicating redacted content."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn71922"

RPM_NAME = "texlive-luacensor-2026.226.1.1.1svn71922-59.2.noarch.rpm"
RPM_HASH = "f55d28422be481ad159e9c2eaf25b7f473c9525682d7c835e0d8abd00505d729d68502bc59de77ed2deb39e07beabbb42e91a00a51103f86ec18207c045a831f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacensor.sty \
texlive-luacensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-environ.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-luacode.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luacensor-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
