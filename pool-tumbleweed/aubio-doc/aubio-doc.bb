SUMMARY = "Documentation for aubio library"
DESCRIPTION = "This package includes the documentation for aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9+git376"

RPM_NAME = "aubio-doc-0.4.9+git376-1.1.noarch.rpm"
RPM_HASH = "e3969b4d5a56ffe5bee5758401854be0cc957758a1a7c85923293473d27a62fbc8177cb8999ec6bc0bd9931d26163347b79d68679ad79b0649bdca757d0a551f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aubio-doc \
aubio-docs"

RDEPENDS:${PN} += ""

inherit rpm
