SUMMARY = "Development files for the cmark-gfm libraries"
DESCRIPTION = "cmark-gfm is GitHub's fork of cmark, the C reference implementation of \
CommonMark with GitHub Flavored Markdown extensions. \
 \
This package provides the header files, unversioned shared library \
symlinks, the pkg-config and CMake support files needed to develop \
applications using cmark-gfm."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.29.0.gfm.13"

RPM_NAME = "cmark-gfm-devel-0.29.0.gfm.13-1.3.aarch64.rpm"
RPM_HASH = "6809bb90844c81514cadb4e5b78654d9eb7ab2b56a395b50b5231523bf4027600ee418c61bad738092ac540cac77ce9c8666d3ad3957e5b1adbfbc6a70f8b7e8"

RPROVIDES:${PN} += "cmark-gfm-devel \
pkgconfig-libcmark-gfm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmark-gfm-extensions0-29-0-gfm-13 \
libcmark-gfm0-29-0-gfm-13"

inherit rpm
