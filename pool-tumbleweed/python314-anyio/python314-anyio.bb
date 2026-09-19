SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "4.14.2"

RPM_NAME = "python314-anyio-4.14.2-1.1.noarch.rpm"
RPM_HASH = "0072aab6cb24c035dcfd0288ffd5e5143baff792f864364487e70dab9696e7f628111fb1f218331a29c58eed22bae876f2ab9f8f4e0508ed7e279b00b4bcd4a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-anyio \
python314-anyio \
python3dist-anyio"

RDEPENDS:${PN} += "python-abi \
python314-idna"

inherit rpm
