SUMMARY = "Babel contributed support for Croatian"
DESCRIPTION = "The package establishes Croatian conventions in a document (or \
a subset of the conventions, if Croatian is not the main \
language of the document)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3lsvn77682"

RPM_NAME = "texlive-babel-croatian-2026.226.1.3lsvn77682-60.2.noarch.rpm"
RPM_HASH = "56eeca2b8b9853c3798d49198f5bbc4e49cfc1b6ac725981dad8c29bae0b445b8b9845b0b4e4fcdfd20bc569328efd880af5951190e1575e06d086ff6f6f9874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-croatian.ldf \
texlive-babel-croatian"

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
