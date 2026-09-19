SUMMARY = "Type-safe, non-relational, multi-backend persistence"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <http://www.stackage.org/package/persistent-template>."
LICENSE = "MIT"

PV = "2.12.0.0"

RPM_NAME = "ghc-persistent-template-2.12.0.0-1.18.aarch64.rpm"
RPM_HASH = "bd4974d6e5f758e80ad73f16235b12744ef5bc80343557d4b0c240e9ee08a2568e153e63c7e61c88e584a1939ef036cf1c28ff9542221fd3faa7661e1badbcf4"

RPROVIDES:${PN} += "ghc-persistent-template"

RDEPENDS:${PN} += ""

inherit rpm
