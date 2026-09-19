SUMMARY = "A replacement for LaTeX's verbatim package"
DESCRIPTION = "This package provides a LaTeX environment listing, an \
alternative to the built-in verbatim environment. The listing \
environment is tailored for including listings of computer \
program source code into documents. The main advantages over \
the original verbatim environment are: environments \
automatically fixes leading whitespace so that the environment \
and program listing can be indented with the rest of the \
document source, and; listing environments may easily be \
customised and extended."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn24638"

RPM_NAME = "texlive-jvlisting-2026.226.0.0.7svn24638-63.2.noarch.rpm"
RPM_HASH = "6cca7e699b75bc882fb3736f1ff6e984d48336838af51459bb048b03a82d9b0b46390fa3aabb7ff382ead6d15afc7843809058ada5049744587e8b23760c112f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jvlisting.sty \
texlive-jvlisting"

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
