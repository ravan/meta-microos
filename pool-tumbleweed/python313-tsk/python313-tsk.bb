SUMMARY = "Python bindings for tsk (The SleuthKit)"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "20250729"

RPM_NAME = "python313-tsk-20250729-2.7.aarch64.rpm"
RPM_HASH = "a330801758e5167edd0a1b8e44dd287bcf4bcf04190a88553558fe983c773c10d119f3e85db3d5221da984f03fc34db0efc38c923dcb5678d0b1c116d04f9f02"

RPROVIDES:${PN} += "python3-tsk \
python3.13dist-pytsk3 \
python313-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
