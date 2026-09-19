SUMMARY = "Lists in TeX's 'mouth'"
DESCRIPTION = "The package was developed to provide flexible lists, whose \
ordering can be altered on the fly. The implementation involves \
a pile of lambda-calculus and list-handling macros of an \
incredibly obtuse nature. The TUGboat paper serves as a manual \
for the macros. Having said all of which, confidence is \
enhanced by the knowledge that the TeX code was formally \
verified."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn17691"

RPM_NAME = "texlive-lazylist-2026.226.1.0asvn17691-61.2.noarch.rpm"
RPM_HASH = "179abb05b354d9118d933e921e2fbe65eeab6282be7d12c8a649de473d60701d926745b733105f783e2b9ff815e54c8f1bfc9e80ae78fa2f9e7971bb09e101e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lazylist.sty \
texlive-lazylist"

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
