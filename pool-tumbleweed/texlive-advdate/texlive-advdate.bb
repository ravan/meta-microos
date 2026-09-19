SUMMARY = "Print a date relative to 'today'"
DESCRIPTION = "Provides macros which can add a specified number of days to the \
current date (as specified in \\today), to save, set and restore \
the 'current date' and to print it. Intended use is, for \
example, in invoices 'payable within 14 days from today', etc. \
The package has only been tested with Czech dates."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-advdate-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "fc5dcbba46967c44978ee65d2680d2e9e6406d64ae84dccfa5eb56665b721f44f207e93b302bcbb5f8064bb3e9eba81a5f8ecf1a169ed9cdc507db5d723c4efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-advdate.sty \
texlive-advdate"

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
