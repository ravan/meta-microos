SUMMARY = "ClamAV antivirus RAR support"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats."
LICENSE = "NonFree"

PV = "1.5.4"

RPM_NAME = "libclamunrar12-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "9b44bfc6f27a835ff4d89abf2d6a31528880e72b7f8507d7e58ae5ec2cc71998142d9189e01d2768c978927908b45783c6f8ecd89ef095ae5e1dbb3d50209c3d"

RPROVIDES:${PN} += "libclamunrar-iface.so.12 \
libclamunrar.so.12 \
libclamunrar12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
