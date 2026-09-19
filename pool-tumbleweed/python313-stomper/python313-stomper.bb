SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python313-stomper-0.4.3-4.10.noarch.rpm"
RPM_HASH = "1b589dc45752fb1f012e0d63b52beffc4e897ccaa80a367302813cf69a300573f014afbcb5483ef0b173bd88b475e3ca310d2628f14511ec8d03b88ada5e11c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stomper \
python3.13dist-stomper \
python313-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
