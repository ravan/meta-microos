SUMMARY = "Include Git information in the document as watermark or via variables"
DESCRIPTION = "If your LaTeX-document is version-controlled with git, you \
might encounter situations, where you want to include some \
information of your git-repository into your LaTeX-document- \
e.g. to keep track on who gave you feedback on which version of \
your document. This git-information can be included on every \
page by a watermark or (for custom needs) via provided \
variables."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn64662"

RPM_NAME = "texlive-gitstatus-2026.226.1.1svn64662-60.4.noarch.rpm"
RPM_HASH = "5d7b38c3784d7213e84bec0b86112d0810ded1c9e99815dd7d56bd72e2a542f2e0e6368748eb0e34e230f6911a3a2aa0dd2f721fd9a83b3f67ec7ab31fb8c362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitstatus.sty \
texlive-gitstatus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
tex-xstring.sty \
tex-xwatermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
