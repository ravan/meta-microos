SUMMARY = "System V IPC primitives for Python"
DESCRIPTION = "System V IPC primitives (semaphores, shared memory and message queues) for Python"
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python314-sysv_ipc-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "ba44c48f7762a92f926f545da1d496acbf4a63a3ee7e37802c19073e6e65d048f06a52c7d204f9677885933d772a909694632694c164fdaf0d9314f07a1439b7"

RPROVIDES:${PN} += "python3.14dist-sysv-ipc \
python314-sysv-ipc \
python3dist-sysv-ipc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
