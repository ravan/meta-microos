SUMMARY = "Provide sectioning information for package writers"
DESCRIPTION = "The stdclsdv package is designed for package writers who need \
to know what sectioning divisions are provided by the \
document's class. It also provides a version of \\CheckCommand \
that sets a flag rather than printing a warning."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn76790"

RPM_NAME = "texlive-stdclsdv-2026.226.1.1asvn76790-64.2.noarch.rpm"
RPM_HASH = "44dac6476f1a8ec03d51a5a9998c31396499c305726bf0e397f482384b566a6346c3b1092254a84b60fc629e32de2b1ac1c6928e406313e7123b33ec9cb3850a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stdclsdv.sty \
texlive-stdclsdv"

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
