SUMMARY = "Control software for sd-mux devices"
DESCRIPTION = "Tool for controlling multiple sd-mux devices (SD_MUX, SDWIRE, etc.)."
LICENSE = "Apache-2.0"

PV = "0.0~git20200217.9dd189d"

RPM_NAME = "sd-mux-ctrl-0.0~git20200217.9dd189d-2.5.aarch64.rpm"
RPM_HASH = "b527c1221f2b5353bd9797eca351db5037732202795307f83b0dcbd2e6dfe75d89704f75c4441a13a688e882c64fe5ba63cdd2b602e7207b612caf5397c58d07"

RPROVIDES:${PN} += "sd-mux-ctrl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libpopt.so.0"

inherit rpm
