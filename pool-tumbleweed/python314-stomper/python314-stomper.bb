SUMMARY = "Transport neutral client implementation of the STOMP protocol"
DESCRIPTION = "This is a python client implementation of the STOMP protocol. \
 \
The client is attempting to be transport layer neutral. This module provides \
functions to create and parse STOMP messages in a programatic fashion. The \
messages can be easily generated and parsed, however its up to the user to do \
the sending and receiving."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python314-stomper-0.4.3-4.10.noarch.rpm"
RPM_HASH = "bdbb925a9432dafe3f2c59f0e9bd07862ff06bea2e02e148d4f2c01b685f55d4e425ed3f70085fa3a8639990444d3ce2cd77be08d5c622791ca6cde93ea1b159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-stomper \
python314-stomper \
python3dist-stomper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
