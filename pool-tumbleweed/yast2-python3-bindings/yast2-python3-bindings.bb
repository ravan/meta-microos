SUMMARY = "Python3 bindings for the YaST platform"
DESCRIPTION = "The bindings allow YaST modules to be written using the Python language \
and also Python scripts can use YaST agents, APIs and modules."
LICENSE = "GPL-2.0-only"

PV = "5.0.3"

RPM_NAME = "yast2-python3-bindings-5.0.3-1.1.aarch64.rpm"
RPM_HASH = "33fdcb8df13398412a251a8392e821225408c3da953a434499efbeba135a73ede5659fa382fb8ff9c0ec0ec7da921386e7413f06868d3f23cfa64c42119d0814"

RPROVIDES:${PN} += "libpy2lang-python3.so.0 \
yast2-python3-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpy2wfm.so.2 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi \
python3 \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
