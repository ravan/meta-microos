SUMMARY = "Define new versions of \\verb, including short verb versions"
DESCRIPTION = "The package allows the definition of \\verb variants which add \
TeX code before and after the verbatim text (e.g., quotes or \
surrounding \\fbox{}). When used together with the shortvrb \
package it allows the definition of short verbatim characters \
which use this package's variant instead of the normal \\verb. \
In addition, it is possible to collect an argument verbatim to \
either typeset or write it into a file. The \\Verbdef command \
defines verbatim text to a macro which can later be used to \
write the verbatim text to a file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6asvn77682"

RPM_NAME = "texlive-newverbs-2026.226.1.6asvn77682-61.2.noarch.rpm"
RPM_HASH = "32a836322a46cdc2778badf3a256affd66f6b4c033f2176ac4d5db84b7045dd7200583c97483cbd30a8a7a92d04b47adcac4b6009083d2ff76ef8bd29fa76c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newverbs.sty \
texlive-newverbs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-shortvrb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
