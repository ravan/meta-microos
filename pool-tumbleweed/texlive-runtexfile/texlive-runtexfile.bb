SUMMARY = "Automate the process of compiling (La)TeX documents with index, bibliography,"
DESCRIPTION = "This package provides a small script like latexmk to run a TeX \
or LaTeX document controlled from within the document itself. \
The commands have to be defined at the beginning of the \
document, e.g.: % HV lualatex --shell-escape % HV biber % HV \
lualatex --shell-escape % HV xindex % HV xindex --config DIN2 \
-l DE -o test2.vwd % HV xindex --config DIN2 -l DE -o \
test2.dbd % HV lualatex --shell-escape % HV lualatex \
--shell-escape \\documentclass[...]{...} ... The script itself \
does not parse the log file."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.06svn76526"

RPM_NAME = "texlive-runtexfile-2026.226.0.0.06svn76526-60.2.noarch.rpm"
RPM_HASH = "5e5a6898405ef0eb4d55196744575ab1651e804c9ef829afd73b7f62a6f08a51216db3cc53695ef690c8ddc1d32865cceaa3045e8ec96e06644d4ecf5de6b15a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-runtexfile"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-runtexfile-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
