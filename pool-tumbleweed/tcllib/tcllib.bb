SUMMARY = "Tcl Standard Library"
DESCRIPTION = "This package is intended to be a collection of Tcl packages that \
provide utility functions useful to a large collection of Tcl \
programmers."
LICENSE = "TCL"

PV = "1.21"

RPM_NAME = "tcllib-1.21-1.11.noarch.rpm"
RPM_HASH = "896968f99283b0d8f6407d2994d40e1bcc61a3181cd2736d754909ca6981bb234f3978c419bdb21742a2d91836637f9e6d09330fd5ececbe0329796a04a4d424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tcllib"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/tclsh"

inherit rpm
