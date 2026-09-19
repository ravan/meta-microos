SUMMARY = "Development files for muparserx"
DESCRIPTION = "The API documentation for muParserX."
LICENSE = "BSD-2-Clause"

PV = "4.0.12"

RPM_NAME = "muparserx-devel-doc-4.0.12-2.5.noarch.rpm"
RPM_HASH = "5016a9d6215addea8dddbfbe5e83651648a4a7a0e5fce0587dec7b280c64b5b77a4aa33a833eaf0bd8ec44adb29ddad495c7dcbdd2caecef100520b0204161f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "muparserx-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
