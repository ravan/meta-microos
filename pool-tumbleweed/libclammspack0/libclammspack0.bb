SUMMARY = "ClamAV antivirus engine runtime"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "libclammspack0-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "53928fa3cc7cd21633ec064374d920d5d8785361975dd35fdba17e36fe910294c103fd796f2394c751324568376048b44ee90432d93f392dd0ed57b0ceebe72a"

RPROVIDES:${PN} += "libclammspack.so.0 \
libclammspack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
