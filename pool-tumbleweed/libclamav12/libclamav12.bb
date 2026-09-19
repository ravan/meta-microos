SUMMARY = "ClamAV antivirus engine runtime"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "libclamav12-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "e6c0014da346b720525b77b0664f076b8327acad75bb4d10b2f4f61e264b8ebd74f8342eb1073c36d50e5c54ae35524be209313ec4eb98f9535535a367cb6ecd"

RPROVIDES:${PN} += "libclamav.so.12 \
libclamav12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libclammspack.so.0 \
libcrypto.so.3 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libxml2.so.16 \
libz.so.1"

inherit rpm
