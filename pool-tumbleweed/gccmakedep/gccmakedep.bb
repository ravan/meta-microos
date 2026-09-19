SUMMARY = "Utility to list the resource database of an X application"
DESCRIPTION = "The gccmakedep program calls 'gcc -M' to output makefile rules \
describing the dependencies of each sourcefile, so that make knows \
which object files must be recompiled when a dependency has changed."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "gccmakedep-1.0.5-1.1.noarch.rpm"
RPM_HASH = "50920958f0d5cdc0af541d86c1466d42bd92d27509d52f9d9e300fe6cd188f41a84891309c73b2f59c42b8a21163b909ee2866133f21688c7022140cccf9b1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gccmakedep"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
