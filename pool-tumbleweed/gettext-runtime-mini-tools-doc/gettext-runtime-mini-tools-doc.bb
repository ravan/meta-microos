SUMMARY = "HTML documentation and examples for gettext-runtime"
DESCRIPTION = "This subpackage contains the HTML version of the gettext documentation \
as well as project examples."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "gettext-runtime-mini-tools-doc-1.0-2.4.noarch.rpm"
RPM_HASH = "0cff92ee4471fc46c86024f2a5d922f13100ae1fe6bc0051ad7837d5ad8e3f92421536838c1cdd5cd73f11b036571494893230825ec5726cb52409401cff1a43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-runtime-mini-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
