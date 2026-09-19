SUMMARY = "Documentation for CKermit"
DESCRIPTION = "This package contains the documentation and manual pages for ckermit."
LICENSE = "BSD-3-Clause"

PV = "9.0.302"

RPM_NAME = "ckermit-doc-9.0.302-20.4.noarch.rpm"
RPM_HASH = "cd73e2eb3a3882276ad69ef40aafd9eed037308230827a0b63713385f79e4697099dfc49f607bf2cb3eacaa45ad79121240adb1dbd429a44731ee4a37567c1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ckermit-doc"

RDEPENDS:${PN} += ""

inherit rpm
