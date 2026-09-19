SUMMARY = "Documentation for rrdtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "rrdtool-doc-1.11.0-1.1.noarch.rpm"
RPM_HASH = "3b582a58e05c485f311712206df10906ba357afc5a1bc5bb5649938d200ac200113b33234f5402758a80890d8548fc62371f06c5940bbea7da25c31fbcdbddf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rrdtool-doc"

RDEPENDS:${PN} += ""

inherit rpm
