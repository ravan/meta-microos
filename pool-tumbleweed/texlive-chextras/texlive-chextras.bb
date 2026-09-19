SUMMARY = "A companion package for the Swiss typesetter"
DESCRIPTION = "The package simplifies the preparation of Swiss documents and \
letters by setting up linguistic and common packages. While it \
is a useful addition to the chletter document class, it is not \
tied to it and may be used as a general purpose package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn27118"

RPM_NAME = "texlive-chextras-2026.226.1.01svn27118-60.2.noarch.rpm"
RPM_HASH = "95f1a85e93a184fd3296939dfe3b02a886a8b0782a99088e1f391fa726127121a000bd7be40d21686d6a3c51134c0ef98bb0d0127739cf5fae3abd44ce002810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chextras.sty \
tex-eu1lmros.fd \
tex-eu1lmssos.fd \
tex-eu1lmttos.fd \
tex-eu1lmvttos.fd \
tex-t1lmros.fd \
tex-t1lmssos.fd \
tex-t1lmttos.fd \
tex-t1lmvttos.fd \
texlive-chextras"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-etoolbox.sty \
tex-fixltx2e.sty \
tex-fontenc.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lmodern.sty \
tex-luainputenc.sty \
tex-makecmds.sty \
tex-xkeyval.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
