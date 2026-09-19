SUMMARY = "Support for automation of the LaTeX workflow"
DESCRIPTION = "The package helps to automate a typical LaTeX workflow that \
involves running LaTeX several times, running tools such as \
BibTeX or makeindex, and so on. It will log requests like \
'please rerun LaTeX' or 'please run BibTeX on file X' to an \
external XML file which lists all open tasks in a \
machine-readable format. Compiler scripts and integrated LaTeX \
editing environments may parse this file to determine the next \
steps in the workflow in a way that is more efficient than \
parsing the main log file. In sum, the package will do two \
things: enable package authors to use LaTeX commands to issue \
requests, collect all requests from all packages and write them \
to an external XML file at the end of the document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn53003"

RPM_NAME = "texlive-logreq-2026.226.1.0svn53003-61.2.noarch.rpm"
RPM_HASH = "d3f75ac2338e8e7cddca03f23062dcf2fa96d7f6ef7419b22a3c95ed2dbe62bff3d1299990afe7faf94d00eb5a1ccb89fd83acdb6b446a5c9f80d754ae4ba2b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logreq.def \
tex-logreq.sty \
texlive-logreq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-keyval.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
