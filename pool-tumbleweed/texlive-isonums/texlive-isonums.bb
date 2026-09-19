SUMMARY = "Display numbers in maths mode according to ISO 31-0"
DESCRIPTION = "The package makes a quick hack to ziffer to display numbers in \
maths mode according to ISO 31-0, regardless of input format \
(European $1.235,7$ or Anglo-American $1,235.7$). The options \
[euro, anglo] control the global input format. Default input \
format is anglo. Documentation is included as comments to the \
text source."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn17362"

RPM_NAME = "texlive-isonums-2026.226.1.0svn17362-63.2.noarch.rpm"
RPM_HASH = "6ee396ffccc59c71a4c8a8c381bac3a18b04601e1d5d313117f56034ca23b72f34c3778c226f1b3bbf61b6cc17f2c27d6e89862e31e39c6aec95ab8986d8b1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isonums.sty \
texlive-isonums"

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
