SUMMARY = "Debug categories files needed by libKPim6Tnef6"
DESCRIPTION = "Debug categories files needed by libKPim6Tnef6."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "ktnef-debug-categories-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3cb566413824e6aa8f052b8a0e79f45604d5cc5b21487c6059053378753712bd130a3321ca590c367883f3ebf09faae5993beeb98aa1358f5849c1e47c332c57"

RPROVIDES:${PN} += "ktnef-debug-categories"

RDEPENDS:${PN} += ""

inherit rpm
