SUMMARY = "Breton (brezhoneg) Dictionary for Aspell"
DESCRIPTION = "A Breton (brezhoneg) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.2"

RPM_NAME = "aspell-br-0.50.2-4.7.aarch64.rpm"
RPM_HASH = "230546b3b3ab9f93464076364e232046e059c206cb7c7bb3271c3d8784a762891c85a298674776b0e89221224cbb0e9f820d30dea5c4618af68e38f74474d9d3"

RPROVIDES:${PN} += "aspell-br \
locale-aspell-br"

RDEPENDS:${PN} += ""

inherit rpm
