SUMMARY = "Support for drawing ER diagrams"
DESCRIPTION = "The package provides some useful macros in the database area. \
The package focusses on typesetting ER-Diagrams in a \
declarative style, i.e., by positioning some nodes and defining \
the position of all other nodes relative to them by using the \
standard database terminology. The PSTricks package is required \
for using pst-dbicons, but no deep knowledge of PSTricks \
commands is required (although such knowledge is useful for \
exploiting the full functionality of the package)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.16svn17556"

RPM_NAME = "texlive-pst-dbicons-2026.226.0.0.16svn17556-59.2.noarch.rpm"
RPM_HASH = "6e4695725dd7dec6b081b196307a335c14ebeb50ab3793a8c3a74910392bad8c2d8e834ef4a3cd0b61ddb80dbccd762b1c6d8ac429bed000ce211a6534cc90e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-dbicons.sty \
texlive-pst-dbicons"

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
