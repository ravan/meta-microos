SUMMARY = "Documentation and examples for the Qore UUID module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
uuid module."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-uuid-module-doc-1.4.1-3.5.noarch.rpm"
RPM_HASH = "28552b7f456a357e3b88a2a4ec008ccef11ecb8f52f0a41b6c9b4763aa2c10239a6226b71b5243495f232a5db6e4a15eaa6ae943905c571b035f35db19a107a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-uuid-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
