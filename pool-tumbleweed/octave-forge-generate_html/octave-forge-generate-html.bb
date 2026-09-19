SUMMARY = "Generate HTML web page from help texts"
DESCRIPTION = "This package provides functions for generating HTML pages that contain \
the help texts for a set of functions. The package is designed to be \
as general as possible, but also contains convenience functions for \
generating a set of pages for entire packages. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.3"

RPM_NAME = "octave-forge-generate_html-0.3.3-1.15.noarch.rpm"
RPM_HASH = "876e42308ad686bc600f0fa755851c716ead000ed94ca42243b40f585f0127f726b0bfaeb6b719d25dec4ec67d6d77604cc4b82caa9e702455952b2ffc6c006b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-generate-html"

RDEPENDS:${PN} += "/usr/bin/sh \
makeinfo \
octave-cli"

inherit rpm
