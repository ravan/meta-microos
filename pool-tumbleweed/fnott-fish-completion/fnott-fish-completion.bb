SUMMARY = "Fish Completion for fnott"
DESCRIPTION = "Fish command-line completion support for fnott."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "fnott-fish-completion-1.8.0-1.7.aarch64.rpm"
RPM_HASH = "fa907ba1ff2e64f2d99ee093edd60fed107593839e1a4f5c3ed1f36ed905896119802f97430325ad3156b60cc0eccea430025294b7e4d40f046589f533dd5ec3"

RPROVIDES:${PN} += "fnott-fish-completion"

RDEPENDS:${PN} += "fish \
fnott"

inherit rpm
