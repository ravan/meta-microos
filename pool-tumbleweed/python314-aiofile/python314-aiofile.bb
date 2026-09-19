SUMMARY = "Asynchronous file operations interface for Python"
DESCRIPTION = "A high-level asynchronous file-operations interface for Python built on \
caio (Linux libaio / POSIX AIO / thread-pool backends)."
LICENSE = "Apache-2.0"

PV = "3.12.3"

RPM_NAME = "python314-aiofile-3.12.3-1.1.noarch.rpm"
RPM_HASH = "2eb05f63dbaee8bf34d344094e551fe8e40b5f4210cfea60bd42a445b4c14349b06db8d9a25a779dd75b00ec8ae3d691ce113b540c012cc15ca1c471d2dd2091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiofile \
python314-aiofile \
python3dist-aiofile"

RDEPENDS:${PN} += "python-abi \
python314-caio"

inherit rpm
