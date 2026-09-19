SUMMARY = "Python3 bindings for GEIS"
DESCRIPTION = "This package provides the python3 bindings for GEIS."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "python3-geis-2.2.17-5.10.aarch64.rpm"
RPM_HASH = "36b6634f601d5a918d2dff7337211199d6a70dc77c2ba21122797dc3ac312c57a701ef107444595a59daabadd45e3bc7c8f0076115601587b818d3189702ad47"

RPROVIDES:${PN} += "python3-geis"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
