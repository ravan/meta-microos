SUMMARY = "Control utility for explicit labeled networking for Linux"
DESCRIPTION = "Explicit labeled networking for Linux \
 \
The NetLabel control utility, netlabelctl, is a command line program designed \
to allow system administrators to configure the NetLabel system in the kernel. \
The utility is based around different 'modules' which correspond to the \
different types of NetLabel commands supported by the kernel."
LICENSE = "GPL-2.0-only"

PV = "0.21"

RPM_NAME = "netlabel-tools-0.21-4.9.aarch64.rpm"
RPM_HASH = "21707be33d94499788df79afc891e7c2bcb5da138ba8ff17666ae886b22b687a3f5325a58d8d90c6c71c120e770af448716a25cdfb11a200d398b01a0bb28832"

RPROVIDES:${PN} += "config-netlabel-tools \
netlabel-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
