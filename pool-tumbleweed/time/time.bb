SUMMARY = "Run Programs And Summarize System Resource Usage"
DESCRIPTION = "The 'time' command runs another program, then displays information \
about the resources used by that program, collected by the system \
while the program was running."
LICENSE = "GPL-3.0-or-later"

PV = "1.10"

RPM_NAME = "time-1.10-1.3.aarch64.rpm"
RPM_HASH = "1145db25f090a097a623a654d1f7659a05bcf328ff3dff41ef16ef0acdd2670115059b32062bf6fe46bbbdc1cf3f3671efdd1ab9a15cba8c7aae630b633596da"

RPROVIDES:${PN} += "time"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
