SUMMARY = "Python bindings for tsk (The SleuthKit)"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "20250729"

RPM_NAME = "python314-tsk-20250729-2.7.aarch64.rpm"
RPM_HASH = "52ee331a6cb8897ecb8d3d428543bbb82ee7c03ea63946fc385dc532070d010ba4a87dcbb2687c6c6d42eed3965f9d29f4c2827d9c38820e3dc71d8c2ea80c76"

RPROVIDES:${PN} += "python3.14dist-pytsk3 \
python314-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
