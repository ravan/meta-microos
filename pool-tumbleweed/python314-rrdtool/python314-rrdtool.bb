SUMMARY = "Python bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains the Python bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "python314-rrdtool-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "e7ae843bb634f8221638174cec7d7c0f0a8dc3924b850cc4ad3c09f5d9ec5ce786830d68923178cdd349b61e2c94ca1b96937c1de459771d1a2cdae45b77abaa"

RPROVIDES:${PN} += "python3.14dist-rrdtool \
python314-rrdtool \
python3dist-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
python-abi \
rrdtool"

inherit rpm
