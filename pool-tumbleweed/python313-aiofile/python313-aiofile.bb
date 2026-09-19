SUMMARY = "Asynchronous file operations interface for Python"
DESCRIPTION = "A high-level asynchronous file-operations interface for Python built on \
caio (Linux libaio / POSIX AIO / thread-pool backends)."
LICENSE = "Apache-2.0"

PV = "3.12.3"

RPM_NAME = "python313-aiofile-3.12.3-1.1.noarch.rpm"
RPM_HASH = "20d1c4f5e39ae23d5016de08938af3eb43dc50d4cfef36ef5c70518c4edf4d16b90addcbe58f6b2841141f032c11a9f72d9f99e81e17cc5fd589876e7219fa90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiofile \
python3.13dist-aiofile \
python313-aiofile \
python3dist-aiofile"

RDEPENDS:${PN} += "python-abi \
python313-caio"

inherit rpm
