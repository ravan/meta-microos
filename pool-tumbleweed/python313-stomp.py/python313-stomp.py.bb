SUMMARY = "Python STOMP client"
DESCRIPTION = "A Python client library for accessing messaging servers (such as ActiveMQ, Apollo or RabbitMQ) using the STOMP protocol versions 1.0, 1.1 and 1.2. It can also be run as a standalone, command-line client for testing."
LICENSE = "Apache-2.0"

PV = "9.0.0"

RPM_NAME = "python313-stomp.py-9.0.0-1.2.noarch.rpm"
RPM_HASH = "cea4216426762e1fefb7a7c87095ce2e401ec276cda63e7f48662b273da1129cf3394db2ceebe4f7906d275462c624e9c44309ba60e67d4df6d221ba54db0636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stomp.py \
python3.13dist-stomp.py \
python313-stomp.py \
python3dist-stomp.py"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3.13dist-docopt-ng \
python3.13dist-websocket-client \
update-alternatives"

inherit rpm
