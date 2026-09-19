SUMMARY = "Documentation for the PARI Computer Algebra System"
DESCRIPTION = "This package contains the documentation and examples for the PARI \
Computer Algebra System."
LICENSE = "GPL-2.0-only"

PV = "2.17.4"

RPM_NAME = "pari-doc-2.17.4-1.3.noarch.rpm"
RPM_HASH = "00eedf41941973d9507ab53c3ab72f34286a19b734d3a4318cea402b0edb37e6e35863082d8c54e11aa678c1f13fb5e8fb8e9ec63945b848939c576d33daf27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-doc"

RDEPENDS:${PN} += ""

inherit rpm
