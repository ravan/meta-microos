SUMMARY = "Buffering stdin and stdout"
DESCRIPTION = "This is a program designed to speed up writing tapes on remote tape \
drives.  When this program is put 'in the pipe,' two processes are \
started.  One process reads from standard-in and the other writes to \
standard-out.  Both processes communicate via shared memory."
LICENSE = "GPL-2.0-or-later"

PV = "1.19"

RPM_NAME = "buffer-1.19-868.5.aarch64.rpm"
RPM_HASH = "3aa3a9096f1a11120a0c72dd4e18a3733647fd74ccb5c7a4832fbad43bd096b931e661443c7e789d890bf704f64cab6fcae11a0b245c1187745d0ac4a0214d5c"

RPROVIDES:${PN} += "buffer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
