SUMMARY = "LaTeX checker"
DESCRIPTION = "Lacheck is a tool for finding common mistakes in LaTeX \
documents. The distribution includes sources, and executables \
for OS/2 and Win32 environments. It is maintained as part of \
TeX Live."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-lacheck-2026.226.svn75712-63.2.noarch.rpm"
RPM_HASH = "2f5ae73b2a55af114bf2c5ff59a2dd47ff155a4ea467f8dbbc89f5f3e30c6adc2660af1af209d18219671f80580b32c99ea80f546afdf74d4b21e772ff517301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-lacheck.1 \
texlive-lacheck"

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
texlive-lacheck-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
