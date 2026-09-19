SUMMARY = "Create an external file from within a LaTeX document"
DESCRIPTION = "LaTeX2e's filecontents and filecontents* environments enable a \
LaTeX source file to generate external files as it runs through \
LaTeX. However, there are two limitations of these \
environments: they refuse to overwrite existing files, and they \
can only be used in the preamble of a document. The \
filecontents package removes these limitations, letting you \
overwrite existing files and letting you use \
filecontents/filecontents* anywhere. As of September 2019 the \
author tells us: 'This package is no longer necessary due to \
its functionality having moved into recent LaTeX kernels. It's \
probably better not to move the package to obsolete because \
users may need it to rebuild old documents. Version 1.5 \
provides full functionality when run with an older kernel but \
issues a warning message and disables itself when run with a \
newer kernel.' Supply the overwrite option to LaTeX's built-in \
filecontents environment to mimic this package's behavior: \
\\begin{filecontents}[overwrite]{my-file}...\\end{filecontents}"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5asvn77682"

RPM_NAME = "texlive-filecontents-2026.226.1.5asvn77682-59.2.noarch.rpm"
RPM_HASH = "e243ea45621f75c0c410470c79f4b7fa3ab462c6273fea9cc778b2e6240e374792d1927e11b06368570bab400b982f4d9506ffea908294fb8c8fbd07f2e23bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filecontents.sty \
texlive-filecontents"

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
