SUMMARY = "IPMI Service Processor, BMC management tool"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "freeipmi-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "fd8dd9d363364b6b375824246a66231b4f983d96e7cabeb3d15a2b6fd9cef4a12cacc32a2f1d88cc819adf43b72c01936d20a1322242d51bdb6411857681d1fe"

RPROVIDES:${PN} += "config-freeipmi \
freeipmi \
freeipmi-ipmimonitoring"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
libipmiconsole.so.2 \
libipmidetect.so.0"

inherit rpm
