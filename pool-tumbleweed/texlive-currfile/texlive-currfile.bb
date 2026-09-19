SUMMARY = "Provide file name and path of input files"
DESCRIPTION = "The package provides macros holding file name information \
(directory, base name, extension, full name and full path) for \
files read by LaTeX \\input and \\include macros; it uses the \
file hooks provided by the author's filehook. In particular, it \
restores the parent file name after the trailing \\clearpage of \
an \\included file; as a result, the macros may be usefully \
employed in the page header and footer of the last printed page \
of such a file. The depth of inclusion is made available, \
together with the 'parent' (including file) and 'parents' (all \
including files to the root of the tree). The package \
supersedes FiNK."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-currfile-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "cbce597b464fa9ceb33b99a4a57fabe828c4e749bcb4b77e4994d9edbbd9b1f6ac40c74c833765e25188d5b27bcaaea170e63ffff5cefc1894ca559d6a8b7e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-currfile-abspath.sty \
tex-currfile.sty \
texlive-currfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-filehook.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
