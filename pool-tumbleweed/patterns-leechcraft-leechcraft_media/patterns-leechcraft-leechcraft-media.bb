SUMMARY = "leechcraft_media"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_media-20170319-1.24.aarch64.rpm"
RPM_HASH = "6912e41159dd96b8400c34c449e67e2dfa6e830a479fbe0aa338c5a1c612bbe71738335feabbaa85bc748f3a131276cb9f286de0f4ebf4e2e7e5350f2c7ecd19"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-leechcraft-leechcraft-media"

RDEPENDS:${PN} += "leechcraft-lmp \
pattern-"

inherit rpm
