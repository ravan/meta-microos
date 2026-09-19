SUMMARY = "Async key-value store abstraction with multiple backends"
DESCRIPTION = "An async key-value store abstraction for Python with a common interface \
over multiple backends (in-memory, filesystem, keyring, and more)."
LICENSE = "Apache-2.0"

PV = "0.4.5"

RPM_NAME = "python314-py-key-value-aio-0.4.5-1.2.noarch.rpm"
RPM_HASH = "06f73720b312a914867eb0db7952c23130f4456ae0b4934d7694ddcdf2b3ad39a2f009ee37ee45721abaa4220da9e758bd40dca820e35c06ddeae251cea25e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-key-value-aio \
python314-py-key-value-aio \
python3dist-py-key-value-aio"

RDEPENDS:${PN} += "python-abi \
python314-aiofile \
python314-anyio \
python314-beartype \
python314-cachetools \
python314-keyring"

inherit rpm
