SUMMARY = "Info Files for the GNU C Library"
DESCRIPTION = "This package contains the documentation for the GNU C library stored as \
info files. Due to a lack of resources, this documentation is not \
complete and is partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.44"

RPM_NAME = "glibc-info-2.44-2.1.noarch.rpm"
RPM_HASH = "8671dc560976fbff5f6ef52f2a6e0dfc2d3ba6ff519842c5ccae97607eb4d9996ee8ebbcc3e4cf16e511fcf0ba3b8fda0fe14c164dda8bbf84d6074fdfada9b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
