SUMMARY = "Simulation and synthesis tool for IEEE-1364"
DESCRIPTION = "Icarus Verilog is a Verilog compiler that generates a variety of \
engineering formats, including simulation. It strives to be true \
to the IEEE-1364 standard."
LICENSE = "GPL-2.0-or-later"

PV = "13.0"

RPM_NAME = "iverilog-13.0-1.4.aarch64.rpm"
RPM_HASH = "1bb3c19672d8f8537543fc3a545c945f6e45bb618e70f25828744ac8cb969f85118e4f3efc01454dfd5d98bfd57d029bf5819a9eab0295a9ddba415b8b9c6e84"

RPROVIDES:${PN} += "iverilog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
