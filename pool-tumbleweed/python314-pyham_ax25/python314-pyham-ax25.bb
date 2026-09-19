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

RPM_NAME = "python314-pyham_ax25-1.0.3-1.4.noarch.rpm"
RPM_HASH = "f764e8468ba1c7e3840483e81098dcd5e8cebfe1b4ec8c6a4daf3ff123aa71f45f2cd6094e34e4e0229be219a516c601e2f03b5c926a2eeafe79bca35e79fb46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyham-ax25 \
python314-pyham-ax25 \
python3dist-pyham-ax25"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
