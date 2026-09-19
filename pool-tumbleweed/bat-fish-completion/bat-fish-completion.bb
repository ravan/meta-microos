SUMMARY = "Fish completion for bat"
DESCRIPTION = "Fish command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.26.1"

RPM_NAME = "bat-fish-completion-0.26.1-2.2.noarch.rpm"
RPM_HASH = "2c96a586aa637c5c629c0d30d92f2e6920bd821aa4f00282f12ca3d97485738ff462dff685a484af8a2baa6ea23950ff2cb16c8ec96e51832ec90ec606e66692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-fish-completion"

RDEPENDS:${PN} += "bat"

inherit rpm
