SUMMARY = "Log file generator for server log files and user-defined formats"
DESCRIPTION = "Logfilegen is a tool to generate common server (nginx, etc) or user-defined \
format log files. It can generate log file with the desired rate (lines per \
second), the file size, lines count and the duration. Each variable of the log \
file can be redefined by the random or static value. The tool is designed to \
be fast and customizable."
LICENSE = "Unlicense"

PV = "3.0.3"

RPM_NAME = "logfilegen-3.0.3-1.12.aarch64.rpm"
RPM_HASH = "c7a6db2e42f0b59f1e05b057cfae633d12a27765adc5d502a8281505e12bcfa246722ebe7b9ad6cc31fa86180585c6554ca00624901f10e9a3470f5f5f38d9f0"

RPROVIDES:${PN} += "logfilegen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
