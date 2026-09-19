SUMMARY = "Documentation for thunarx-python"
DESCRIPTION = "This package provides the documentation files for python thunarx."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "thunarx-python-doc-0.5.2-1.26.aarch64.rpm"
RPM_HASH = "f618b24164d2e279c69053f5ce47c7d78c388ae6f4f94411bdbe2f512f9681655f9d81ccce53a054ade4bc351b817b32744459628f6c6cabc2aaf00271d26e1a"

RPROVIDES:${PN} += "thunarx-python-doc"

RDEPENDS:${PN} += ""

inherit rpm
