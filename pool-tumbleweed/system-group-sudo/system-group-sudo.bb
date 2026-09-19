SUMMARY = "System group 'sudo'"
DESCRIPTION = "This package provides the system group 'sudo'."
LICENSE = "ISC"

PV = "1.9.17p2"

RPM_NAME = "system-group-sudo-1.9.17p2-4.1.noarch.rpm"
RPM_HASH = "5430606fad1258d2f045d90b368eafa7b054e30e16c2a1ac9716ceddc3f31d16fee86f82814174f2fd825a553e81d559491439ad9778af6259f1da029f2dea5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-sudo \
system-group-sudo"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
