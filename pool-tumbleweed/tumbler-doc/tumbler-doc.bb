SUMMARY = "Developer Documentation for tumbler"
DESCRIPTION = "This package provides the developer documentation for tumbler."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "tumbler-doc-4.20.2-1.1.noarch.rpm"
RPM_HASH = "1e22a30a014883ca08a2241574f8cc0c88cddd6364aa7d64b09ae5c3f2eaa6e9df7704408aa32826716831e43680a3c5de6471ff0109d161250c8030d61ae78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tumbler-doc"

RDEPENDS:${PN} += ""

inherit rpm
