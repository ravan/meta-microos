SUMMARY = "Enhanced version of 'wg show' showing peer names and online status"
DESCRIPTION = "Better wireguard status script \
 \
This script allows you to actually know, which peer in the `wg show` output is which by assigning them a name. \
Also you can see, which peers are actually online as `wg-info` will ping them and set the color (red/green) accordingly. \
To save time, this is done for all the peers in parallel. \
 \
The output is colored (if writing to a tty or explicitly requested) using terminal sequences, HTML or be just plain text."
LICENSE = "AGPL-3.0-or-later"

PV = "20240702.9b5c479"

RPM_NAME = "wg-info-20240702.9b5c479-1.7.noarch.rpm"
RPM_HASH = "fae870ce546c633fac9a0d521f510bf68c37d4069e6facf1bb04ab082d1c85d3863b7759ebf25314c2db96e23c4385370dff8aa2a654e4827ca54a0fc38b89f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wg-info"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
wireguard-tools"

inherit rpm
