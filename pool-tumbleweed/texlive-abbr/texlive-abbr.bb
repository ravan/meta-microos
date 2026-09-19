SUMMARY = "Simple macros supporting abbreviations for Plain and LaTeX"
DESCRIPTION = "The package provides some simple macros to support \
abbreviations in Plain TeX or LaTeX. It allows writing (e.g.) \
\\<TEX> instead of \\TeX, hence frees users from having to escape \
space after parameterless macros."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77161"

RPM_NAME = "texlive-abbr-2026.226.svn77161-61.2.noarch.rpm"
RPM_HASH = "bc2d4fa497d13283a434256d3dd740074b54ffd77631d04f7acfd97fca37547f495199b7672a1921e80704b5987cd24016d22ab4ba04618744ce2c9ac2b8fcfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abbr.tex \
texlive-abbr"

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
