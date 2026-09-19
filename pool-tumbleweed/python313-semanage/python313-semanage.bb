SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.11"

RPM_NAME = "python313-semanage-3.11-1.2.aarch64.rpm"
RPM_HASH = "14fd6827f2075bf664534ce4fa60a66c0a94b2278cc2790cee5d03c12ad4e5c0691c439cb762e90eedf20bba72bd596a379b30cb28099acf34b9d009e22d3955"

RPROVIDES:${PN} += "python3-semanage \
python313-semanage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsemanage.so.2 \
libsemanage2 \
python-abi"

inherit rpm
