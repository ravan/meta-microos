SUMMARY = "Establish input relative to a directory"
DESCRIPTION = "The commands \\import{full_path}{file} and \
\\subimport{path_extension}{file} set up input through standard \
LaTeX mechanisms (\\input, \\include and \\includegraphics) to \
load files relative to the \\import-ed directory. There are also \
\\includefrom, \\subincludefrom, and * variants of the commands."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.6.2svn77682"

RPM_NAME = "texlive-import-2026.226.6.2svn77682-60.2.noarch.rpm"
RPM_HASH = "9d2d0444c8acc9d20b0f108b2ab4d7a5d910960ba1037cecb62b9aef0da7267479346159785d4a88218681b871f71b7d7a735c730940e765820eaece821eba56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-import.sty \
texlive-import"

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
