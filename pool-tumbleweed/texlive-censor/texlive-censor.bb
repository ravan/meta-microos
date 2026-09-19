SUMMARY = "Tools for producing redacted documents"
DESCRIPTION = "This package provides simple tools for creating redacted \
documents with blacked-out text. Its tools are useful both for \
creating documents in a restricted environment (for redacted \
release in an unrestricted environment) as well as in an \
unrestricted environment (for eventual transfer and completion \
in the restricted environment)."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.5svn74794"

RPM_NAME = "texlive-censor-2026.226.4.5svn74794-59.2.noarch.rpm"
RPM_HASH = "aa98b6881658f3356cf3a0b26973e2ac955fdf3f78e77d74020f97972fe677cf5d32e2fcc0a1b9b2dc68621b746f7db694210d683d6cdb19fa450bdf51ec0782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-censor.sty \
texlive-censor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pbox.sty \
tex-tokcycle.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
