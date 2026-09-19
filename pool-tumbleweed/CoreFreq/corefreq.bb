SUMMARY = "CPU monitoring software for 64-bit processors"
DESCRIPTION = "CPU monitoring software with BIOS like functionalities designed for \
64-bit processors of architecture Intel Atom, Core2, Nehalem, SandyBridge and superiors; \
AMD Families from 0Fh ... up to 17h (Zen , Zen+ , Zen 2), 18h (Hygon Dhyana), \
19h (Zen 3, Zen 3+, Zen 4, Zen 4c), 1Ah (Zen 5, Zen 5c); \
Arm A64; RISC-V RV64; PowerPC64 (LE)"
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4"

RPM_NAME = "CoreFreq-2.1.4-3.2.aarch64.rpm"
RPM_HASH = "9c639170909edddaa742bfaee441afa468ba6b8d35e1b5c7384763a4a8aaad0d938d8d149c506e34827bb468128e3a85b70f5e857263dbf33713be276529d0a4"

RPROVIDES:${PN} += "CoreFreq"

RDEPENDS:${PN} += "/usr/bin/sh \
CoreFreq-kmp \
libc.so.6 \
libm.so.6"

inherit rpm
