SUMMARY = "A Python HTTP client library"
DESCRIPTION = "A comprehensive HTTP client library that supports many features \
left out of other HTTP libraries."
LICENSE = "Apache-2.0 & MIT & (GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later)"

PV = "0.32.0"

RPM_NAME = "python313-httplib2-0.32.0-1.1.noarch.rpm"
RPM_HASH = "1c32a5c51153c9b26589760b8e0ac8ddc637f1d7e12986ba8a2ba83d4aefb8d38c90b56bc5118bf22ce71c3b0c1c1d7f769e1d641729330d4c4c0c7662863b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httplib2 \
python3.13dist-httplib2 \
python313-httplib2 \
python3dist-httplib2"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python313-pyparsing"

inherit rpm
