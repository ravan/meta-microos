SUMMARY = "Notes in the margin, even where \\marginpar fails"
DESCRIPTION = "This package provides the command \\marginnote that may be used \
instead of \\marginpar at almost every place where \\marginpar \
cannot be used, e.g., inside floats, footnotes, or in frames \
made with the framed package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4dsvn77682"

RPM_NAME = "texlive-marginnote-2026.226.1.4dsvn77682-59.2.noarch.rpm"
RPM_HASH = "35827862a9232370b818f7ed21c9535b6d98264366023a7194f09e5eaa43ec7c0c2972b800391964870a475dac38a1d87b64d4c7279e8a93aebd9bb8a121a0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marginnote.sty \
texlive-marginnote"

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
