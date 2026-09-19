SUMMARY = "An upload tool for AVR microcontrollers"
DESCRIPTION = "Uisp is a tool for AVR microcontrollers and drives many hardware \
in-system programmers. Uisp allows programming a microcontroller \
through the parallel port."
LICENSE = "GPL-2.0-or-later"

PV = "20050207suse"

RPM_NAME = "uisp-20050207suse-170.9.aarch64.rpm"
RPM_HASH = "77b91cedfb906ff3eba8a17f4ace155ca81d9f2414940125097704e7e957eb57f97a49aa3ccb9f65551750f11c564fd74e413c25345473ec19bde24d3879c6ee"

RPROVIDES:${PN} += "avr-programmer \
uisp"

RDEPENDS:${PN} += "/sbin/modprobe \
/usr/bin/cat \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
