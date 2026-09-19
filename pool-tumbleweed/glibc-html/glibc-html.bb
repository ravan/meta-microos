SUMMARY = "HTML Documentation for the GNU C Library"
DESCRIPTION = "This package contains the HTML documentation for the GNU C library. Due \
to a lack of resources, this documentation is not complete and is \
partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.44"

RPM_NAME = "glibc-html-2.44-2.1.noarch.rpm"
RPM_HASH = "0e24857cdd243cfd1065954aa3606cbee1111ed38468375654953e046b26f2a8649fe55af1f102325db5b24f08c086a762f193f2c2d5598c55f51b0a511366ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-html"

RDEPENDS:${PN} += ""

inherit rpm
