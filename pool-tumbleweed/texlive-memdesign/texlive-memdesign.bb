SUMMARY = "Notes on book design"
DESCRIPTION = "'A Few Notes on Book Design' provides an introduction to the \
business of book design. It is an extended version of what used \
to be the first part of the memoir users' manual. Please note \
that the compiled copy, supplied in the package, uses \
commercial fonts; the README file contains instructions on how \
to compile the document without these fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn48664"

RPM_NAME = "texlive-memdesign-2026.226.svn48664-59.2.noarch.rpm"
RPM_HASH = "ee143e8c9e46884d45beba4161fe7395072244eb5aec9e827f8d5449fe6e3bd335acadfb3a95d8c4b3f64e097cffc3fc8c700105984599f416a4ee76e34cbf2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memdesign"

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
