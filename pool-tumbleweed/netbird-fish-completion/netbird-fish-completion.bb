SUMMARY = "Fish Completion for netbird"
DESCRIPTION = "Fish command line completion support for netbird."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-fish-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "bda43d952318cf6ac869500dde43d634eb2aecc84890e4cf3396a278b2a04734c25048a608ad906e730618098f3568abdbe796edb19447464ffd76164159fab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-fish-completion"

RDEPENDS:${PN} += "fish \
netbird"

inherit rpm
