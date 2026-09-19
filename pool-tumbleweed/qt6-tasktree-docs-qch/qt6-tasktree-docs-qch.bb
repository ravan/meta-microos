SUMMARY = "Documentation for qt6-tasktree in QCH format"
DESCRIPTION = "This package contains documentation for qt6-tasktree in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-tasktree-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "61c5151db0219bdd2c02505416800c4f8d2a199ea83188ce1aee69ba99189c90a298c3594bb21b7dbe8c0b0b8fc2e354ddb05bc5a24682178d20c3c15f824078"

RPROVIDES:${PN} += "qt6-tasktree-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
