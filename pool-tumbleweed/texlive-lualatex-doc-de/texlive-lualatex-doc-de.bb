SUMMARY = "Guide to LuaLaTeX (German translation)"
DESCRIPTION = "The document is a German translation of the map/guide to the \
world of LuaLaTeX. Coverage supports both new users and package \
developers. Apart from the introductory material, the document \
gathers information from several sources, and offers links to \
others."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.1.0svn30474"

RPM_NAME = "texlive-lualatex-doc-de-2026.226.1.0svn30474-59.2.noarch.rpm"
RPM_HASH = "009f84ce2ef2fd9231ca5ee1c277d68de5b950a3cae914e9f96b671a9d78e55c9000144f52578fdbb5201ed69beb33fe2b2cadedecd43f112ac7c6b0657f6198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualatex-doc-de"

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
