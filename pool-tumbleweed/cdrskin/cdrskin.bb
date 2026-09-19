SUMMARY = "Limited cdrecord Compatibility Wrapper"
DESCRIPTION = "cdrskin is a limited cdrecord compatibility wrapper which allows to use most of \
the libburn features from the command line."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "cdrskin-1.5.8-1.3.aarch64.rpm"
RPM_HASH = "c357823e7ea1d651ea659a928624db947c081489b317812fadfa24a1be2871daca2227d3a779bd81de1a9648e1821a6f3c845bb13bfb0d215668ade5b74c26de"

RPROVIDES:${PN} += "cdrskin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libburn.so.4 \
libc.so.6"

inherit rpm
