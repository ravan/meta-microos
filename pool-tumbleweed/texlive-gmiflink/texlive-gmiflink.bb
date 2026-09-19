SUMMARY = "Simplify usage of \\hypertarget and \\hyperlink"
DESCRIPTION = "Three hyperref-based macros that simplify usage of \\hypertarget \
and \\hyperlink: one argument instead of the same one twice. \
Also \\gmiflink and \\gmifref which typeset plain text instead of \
generating an error or printing '??' if there is no respective \
hypertarget or label."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-2026.226.0.0.97svn15878-60.4.noarch.rpm"
RPM_HASH = "b040146337b06bb54ede3a78805559b5c49a7e67fbb3c51b4e4467254fa0586017ac911adbcbfeca27f35c62d903d1a191a5293f92706fc0830b00f31d455c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmiflink.sty \
texlive-gmiflink"

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
