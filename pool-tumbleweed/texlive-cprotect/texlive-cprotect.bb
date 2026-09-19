SUMMARY = "Allow verbatim, etc., in macro arguments"
DESCRIPTION = "The package defines the macro \\cprotect that makes a following \
macro proof against verbatim in its argument; as, for example, \
\\cprotect\\section{\\verb'foo'} A similar macro \\cprotEnv \
(applied to the \\begin of an environment) sanitises the \
behavior of fragile environments. Moving arguments, and \
corresponding 'tables of ...' work happily."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0esvn77682"

RPM_NAME = "texlive-cprotect-2026.226.1.0esvn77682-61.2.noarch.rpm"
RPM_HASH = "94a5e759d4e5e21a422edf92f51a9688da7656f1e638ebb610a8ad5b09ce09b2b7c85ea5709f91d9edef302f5df32cb59b0e5b2da31f499dabd1268944fe05fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cprotect.sty \
texlive-cprotect"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
