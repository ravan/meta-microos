SUMMARY = "System V IPC primitives for Python"
DESCRIPTION = "System V IPC primitives (semaphores, shared memory and message queues) for Python"
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python313-sysv_ipc-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "283f90107db42816448bbd2208e3cefd8ca19d5628d5e307050ca396d029654ca7538acc25326c3957a27847d79db5350941082b1fddf6621d983644f02795e1"

RPROVIDES:${PN} += "python3-sysv-ipc \
python3.13dist-sysv-ipc \
python313-sysv-ipc \
python3dist-sysv-ipc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
