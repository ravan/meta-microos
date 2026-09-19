SUMMARY = "Packet radio terminal using the AGWPE protocol"
DESCRIPTION = "Paracon is a packet radio terminal. It is focused on simplicity and ease of \
use, and incorporates the core functionality that most packet users need \
without trying to include all of the bells and whistles that few would use. \
 \
It talks to the TNC using AGWPE and works well with the direwolf software TNC. \
If you have a classic KISS or 6PACK TNC you can use the classic Linux native \
AX.25 stack with ldsped on top to be able to speak AGWPE."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "paracon-1.3.0-2.4.noarch.rpm"
RPM_HASH = "92f7587599d04e37262910ed78477e235c7d4b1bc82be3e8bde0884722a464cd93e4b865b2dd09cd2de6eeed3b601432e18d9afadba81b09c09d33d5aace498c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paracon \
python3.13dist-paracon \
python3dist-paracon"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3 \
python3-pyham-ax25 \
python3-pyham-pe \
python3-urwid"

inherit rpm
