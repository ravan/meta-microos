SUMMARY = "A Python HTTP client library"
DESCRIPTION = "A comprehensive HTTP client library that supports many features \
left out of other HTTP libraries."
LICENSE = "Apache-2.0 & MIT & (GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later)"

PV = "0.32.0"

RPM_NAME = "python314-httplib2-0.32.0-1.1.noarch.rpm"
RPM_HASH = "ee3bdd2a0b6e9bcc74dc52f60a5476d72dcf2f169c1d5d7f8f567e94c606cc3d43802013e7a91d5394fe0476218c1c681ba16e4621f530d003848410857eeead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httplib2 \
python314-httplib2 \
python3dist-httplib2"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python314-pyparsing"

inherit rpm
