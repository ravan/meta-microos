SUMMARY = "Kerning between words and against space"
DESCRIPTION = "This package provides two shorthands for typesetting breaking \
and non-breaking small spaces, where both hyphenation and \
kerning against space are correctly applied. Additionally, \
interword kerning can be applied."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn67604"

RPM_NAME = "texlive-spacekern-2026.226.0.0.3svn67604-64.2.noarch.rpm"
RPM_HASH = "44b435958a4bcbd687f4a3e1a24566cbcdfc1904387a1dfbc0fba5c8ef1a675a91db7a721541b460b287c4af838a57ba7e82eafb59fdb63951c12a5ec84349b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spacekern.sty \
texlive-spacekern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
