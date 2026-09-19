SUMMARY = "Tools to submit from Git to OBS via Jenkins"
DESCRIPTION = "This is a collection of scripts used to connect github via jenkins to the \
open build service."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "linuxrc-devtools-1.5-1.4.noarch.rpm"
RPM_HASH = "f8476c94e39b5e59e96399de7dc7ea04fcb5d9df600145379bb055522d012e41192980125e1199994a8e32a2b87048acc5e4a3d4a12b39d81256da0a898ee09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linuxrc-devtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl"

inherit rpm
