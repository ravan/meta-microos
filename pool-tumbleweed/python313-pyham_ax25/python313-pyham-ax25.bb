SUMMARY = "Modules for working with AX.25 packets in an amateur packet radio env"
DESCRIPTION = "The ax25 and ax25.netrom modules provide structure definitions together with \
methods to pack and unpack native AX.25 frames and NET/ROM routing table \
updates. These modules work on all platforms, and can be used together with \
the transport mechanism(s) of your choice. \
 \
The ax25.ports and ax25.socket modules provide facilities for working with \
the Linux native AX.25 stack. Unlike other Python AX.25 packages, this includes \
the creation and use of connected-mode sessions, and thus it is not limited to \
unproto (UI frame) usage."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python313-pyham_ax25-1.0.3-1.4.noarch.rpm"
RPM_HASH = "0f8d8601b4950b75292684a235822473c747b9f072c6205511db5ae0c33da3ff58989eaef2a188d9457e50e4f0aa2a97162ea97bbf4961e84a26f7f7598faabe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyham-ax25 \
python3.13dist-pyham-ax25 \
python313-pyham-ax25 \
python3dist-pyham-ax25"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
