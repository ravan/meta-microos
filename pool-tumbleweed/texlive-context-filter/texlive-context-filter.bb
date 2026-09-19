SUMMARY = "Run external programs on the contents of a start-stop environment"
DESCRIPTION = "The filter module provides a simple interface to run external \
programs on the contents of a start-stop environment. Options \
are available to run the external program only if the content \
of the environment has changed, to specify how the program \
output should be read back, and to choose the name of the \
temporary files that are created. The module is compatible with \
both MkII and MkIV."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn62070"

RPM_NAME = "texlive-context-filter-2026.226.svn62070-61.2.noarch.rpm"
RPM_HASH = "c7f4c7a31491e7af428032a4f4a56513bf6a6dbd99ae4823cce86e8d17a7d6f5fade753f20cb795a7dac32bfa1b0a416cd21d98d92e0b9ada3eaddaa6c2267ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-filter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
