SUMMARY = "Extends eTeX's \\numexpr...\\relax construct to big integers"
DESCRIPTION = "The package provides the command \\bnumeval, which extends \
LaTeX's \\inteval with support for arbitrarily big integers, // \
for floored division, /: for the associated remainder, ^ and ** \
for powers, ! for factorials, 0b, 0o and ', 0x and ', as \
prefixes for binary, octal, or hexadecimal inputs. With the \
optional argument [h] (or [o] or [b]) the output is converted \
to hexadecimal (or octal, or binary)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7bsvn77682"

RPM_NAME = "texlive-bnumexpr-2026.226.1.7bsvn77682-59.2.noarch.rpm"
RPM_HASH = "558119f7379cabb9a09a1d5eb5725148ad5df6f01ffc25159e04b1ca435c60adaa24630ede72f5100e28f078c8e5d8ea8e619f461228245f3e4a1076f426d914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bnumexpr.sty \
texlive-bnumexpr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xintbinhex.sty \
tex-xintcore.sty \
tex-xintkernel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
