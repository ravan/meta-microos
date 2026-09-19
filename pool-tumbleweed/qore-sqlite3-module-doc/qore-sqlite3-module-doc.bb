SUMMARY = "Documentation and examples for the Qore sqlute3 module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
xml module."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "qore-sqlite3-module-doc-1.0.2-3.5.noarch.rpm"
RPM_HASH = "8f464b87bdf5fc501e776195564bd38a42528dfda59d05bb79f05687789021a4227deebe00b099e39fb138e699f27cec07128402b0c133d4593ecd9d3b6c0818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-sqlite3-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
