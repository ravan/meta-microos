SUMMARY = "Python bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains the Python bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "python313-rrdtool-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "146db3e55f967120db83c71b680df33939a3a0f5f0a96fcda3fa15ae0a96b075d956a86dccd28874a5aa9603ee5909511e1f85ea10b5ce1ccfc853f92c7e04ba"

RPROVIDES:${PN} += "python3-rrdtool \
python3.13dist-rrdtool \
python313-rrdtool \
python3dist-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
python-abi \
rrdtool"

inherit rpm
