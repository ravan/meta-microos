SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "4.14.2"

RPM_NAME = "python313-anyio-4.14.2-1.1.noarch.rpm"
RPM_HASH = "d4f5484f2ef24e3eeb6f41d54cf3062a68d911a9353eba1b87cdd38a8fd038db1fd0dae479104a712af9153976a2ba4dae7ad2910cacd032d4a97ff1db9cce75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyio \
python3.13dist-anyio \
python313-anyio \
python3dist-anyio"

RDEPENDS:${PN} += "python-abi \
python313-idna"

inherit rpm
