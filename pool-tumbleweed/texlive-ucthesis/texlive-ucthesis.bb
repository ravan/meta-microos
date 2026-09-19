SUMMARY = "University of California thesis format"
DESCRIPTION = "A modified version of the standard LaTeX report style that is \
accepted for use with University of California PhD \
dissertations and Masters theses. A sample dissertation source \
and bibliography are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn15878"

RPM_NAME = "texlive-ucthesis-2026.226.3.2svn15878-60.2.noarch.rpm"
RPM_HASH = "9f85c1e6576b785eb0690532fbe0f6e99b3054b5d32f0289985d876187f702429c1bcb6ee91786fd3819a6a243f4b40f0be33d1274e9c320706501cbc24bcc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uct10.clo \
tex-uct11.clo \
tex-uct12.clo \
tex-ucthesis.cls \
texlive-ucthesis"

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
