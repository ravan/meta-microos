SUMMARY = "Python STOMP client"
DESCRIPTION = "A Python client library for accessing messaging servers (such as ActiveMQ, Apollo or RabbitMQ) using the STOMP protocol versions 1.0, 1.1 and 1.2. It can also be run as a standalone, command-line client for testing."
LICENSE = "Apache-2.0"

PV = "9.0.0"

RPM_NAME = "python314-stomp.py-9.0.0-1.2.noarch.rpm"
RPM_HASH = "975bbefeb47ee06c9821d0a2ea4205200fa56127845821ad65b80eb975cf01715d947d4a8502f7b4e34b5e4957f793a92bb5e07f324a438c419485fb4965626d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-stomp.py \
python314-stomp.py \
python3dist-stomp.py"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python3.14dist-docopt-ng \
python3.14dist-websocket-client \
update-alternatives"

inherit rpm
