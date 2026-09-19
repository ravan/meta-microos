SUMMARY = "Tool for Creating Cool ASCII-Art Signatures"
DESCRIPTION = "FIGlet can create characters in many different styles and can kern and \
'smush' these characters together in various ways. FIGlet output is \
generally reminiscent of the sort of 'signatures' many people like to \
put at the end of e-mail and UseNet messages."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "figlet-2.2.5-4.9.aarch64.rpm"
RPM_HASH = "21a7902e3ec137c784f4588e2340332601db768873b674d988c5eb62c246daf3160733d968286d0a7586ba4d62914e5e883167e9df287a867006c31923307148"

RPROVIDES:${PN} += "figlet"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
