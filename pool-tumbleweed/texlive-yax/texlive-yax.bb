SUMMARY = "Yet Another Key System"
DESCRIPTION = "YaX is advertised as a key system, but it rather organizes \
attributes in parameters, which parameters can be executed, so \
that YaX is halfway between key management and macro definition \
(and actually hopes to provide a user's interface). Values \
assigned to attributes can be retrieved and tested in various \
ways, with full expandability ensured as much as possible. \
Finally, YaX's syntax is a quite peculiar (as few braces as \
possible), but may be customized. YaX is based on texapi and \
thus requires e-TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn54080"

RPM_NAME = "texlive-yax-2026.226.1.03svn54080-59.4.noarch.rpm"
RPM_HASH = "976a97ea3ebf72175d214b7e966e5f039ad83c178fc9f5cbb56a7859fc3d04f12d0da0234a21af6804dcf30cbb9969dd7b1f856ab4bd67cb28877f895e0a8b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-yax.tex \
tex-yax.sty \
tex-yax.tex \
texlive-yax"

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
