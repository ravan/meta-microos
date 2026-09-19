SUMMARY = "ClamAV updater library"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "libfreshclam4-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "93843389b57ecb216582045e607bf258cfef708e6680890b2dc4c2682c872fc153698cfaa47eba86165f683b7e4cc194add51603c2e00448c650d61100c36277"

RPROVIDES:${PN} += "libfreshclam.so.4 \
libfreshclam4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclamav.so.12 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
