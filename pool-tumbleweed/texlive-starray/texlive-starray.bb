SUMMARY = "A structured array (of properties) based on expl3"
DESCRIPTION = "This package implements vector-like 'structures', like in 'C' \
and other programming languages. So it is possible to store \
information in a systematic and regular way. The provided \
'functions' are similar to the ones provided for property (or \
sequence, or token) lists. The package is based on expl3 and \
aimed at package authors, not end users. The name 'starray' is \
an abbreviation for 'structured arrays'."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn78110"

RPM_NAME = "texlive-starray-2026.226.2.1svn78110-64.2.noarch.rpm"
RPM_HASH = "acc20f06359a6fce684de0d199326fb67c7341da903d5db986cca4aad60623aa7eb45241380f7b9ac71ba25781ac10793a4aeb586e2de05c2a4ceb2205359620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-starray.sty \
texlive-starray"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
tex-tokglobalstack.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
