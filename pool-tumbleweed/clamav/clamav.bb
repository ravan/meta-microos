SUMMARY = "Antivirus Toolkit"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats. It is the de-facto \
standard for mail gateway scanning. It provides a multi-threaded \
scanning daemon, command line utilities for on-demand file scanning, \
and a tool for automatic signature updates. The core ClamAV library \
provides numerous file format detection mechanisms, file unpacking \
support, archive support, and multiple signature languages for \
detecting threats."
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "clamav-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "333aaf5684b41a3e66917dfd98de3d28f1dbff0d6f1211a553b37009ab152d154b344deffd12e70b01ee9781613af173402b0664ef3c9d37c32a13b590670920"

RPROVIDES:${PN} += "clamav \
clamav-nodb \
config-clamav"

RDEPENDS:${PN} += "/usr/bin/sh \
group-vscan \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclamav.so.12 \
libclamav12 \
libclammspack0 \
libcrypto.so.3 \
libcurl.so.4 \
libfreshclam.so.4 \
libfreshclam4 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libncurses.so.6 \
libssl.so.3 \
libsystemd.so.0 \
libtinfo.so.6 \
libz.so.1 \
user-vscan"

inherit rpm
