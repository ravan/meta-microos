SUMMARY = "Show for approval the filenames used in \\input, \\openin, or \\openout"
DESCRIPTION = "This package provides macros to make the file I/O in plain TeX \
more transparent. That is, every \\input, \\openin, and \\openout \
operation by TeX is presented to the user who must check \
carefully if the file name of the source is acceptable. The \
user must sometimes enter additional text and has to specify \
the file name that the TeX operation should use. The macros \
require a complex installation procedure; the package contains \
sed and bash scripts to do this on a UNIX-like operating \
system. Every installation is different from any other as \
password-protected macro names and private messages have to be \
chosen by the installer. Therefore, the files in the package \
cannot be used directly. The files carry the extension .org, \
and only after the user has performed an individual \
customization for a private installation the changed files are \
renamed and have the extension .tex. For details see the \
manual."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn64113"

RPM_NAME = "texlive-transparent-io-2026.226.svn64113-59.2.noarch.rpm"
RPM_HASH = "34418cd4e3c2a037c217869bc99d7ba86120177c5c4be3ad9b0b92c0dc6922b187b1e3280b87bd46a60b88ca6db60607d178d0f8f72ff0e4878a12c98a96870c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-transparent-io"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
