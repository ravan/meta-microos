SUMMARY = "Stenotype input schema for rime"
DESCRIPTION = "stenotype input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-stenotype-20250315-1.4.noarch.rpm"
RPM_HASH = "6fb68f750d9e612d0f53a568c6a9cf3adfe4635db55df071fcbf7512539162c209125a1291a94201515b6f05f85a4a0e58af5fb10f63b539048fced896c65d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-stenotype"

RDEPENDS:${PN} += ""

inherit rpm
