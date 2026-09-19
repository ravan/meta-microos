SUMMARY = "Faust OSC Library"
DESCRIPTION = "Dynamic Faust OSC Library."
LICENSE = "GPL-2.0-only"

PV = "2.88.0"

RPM_NAME = "libOSCFaust1-2.88.0-1.1.aarch64.rpm"
RPM_HASH = "191baf7f1d47efdf867400cee13e02061b043c758edf86c7d81ab431a553bcf1e8e53d9d295454e607788f407270aee314e6f9e0fd355978d3cea0e9aad9e2cd"

RPROVIDES:${PN} += "libOSCFaust.so.1 \
libOSCFaust1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
