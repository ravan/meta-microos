SUMMARY = "Documentation for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (Manual)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-manual-2.1.1-2.9.noarch.rpm"
RPM_HASH = "730e15ac66f94fc3818baac70477e1ad502aa8d9abfca64553155581ca5c34b45bbe8ffc3556efe308981490648ae64475c41769fa5efcdbf16ae13a4edce729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-manual"

RDEPENDS:${PN} += ""

inherit rpm
