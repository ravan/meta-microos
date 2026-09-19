SUMMARY = "German letter DIN style"
DESCRIPTION = "Implements a document layout for writing letters according to \
the rules of DIN (Deutsches Institut fur Normung, German \
standardisation institute). A style file for LaTeX 2.09 (with \
limited support of the features) is part of the package. Since \
the letter layout is based on a German standard, the user guide \
is written in German, but most macros have English names from \
which the user can recognize what they are used for. In \
addition there are example files showing how letters may be \
created with the package. A graphical interface for use of the \
dinbrief is provided in the dinbrief-GUI bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-dinbrief-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "5792ff02028a13adf50acf67c24cd21ad60f207ff34295892b869a32a7f96b3860ef12093d586aac1f2e0f83621f504cb8deb46149bee49f7dd56e0942fce8c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dinbrief.cfg \
tex-dinbrief.cls \
tex-dinbrief.sty \
texlive-dinbrief"

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
