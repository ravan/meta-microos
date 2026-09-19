SUMMARY = "Async key-value store abstraction with multiple backends"
DESCRIPTION = "An async key-value store abstraction for Python with a common interface \
over multiple backends (in-memory, filesystem, keyring, and more)."
LICENSE = "Apache-2.0"

PV = "0.4.5"

RPM_NAME = "python313-py-key-value-aio-0.4.5-1.2.noarch.rpm"
RPM_HASH = "3f88ca9f4e576f36a3ba5d4c3236112ea8254c4ee49d2d6b7d4e02e5ecd101d14337bc8b924db1457708526e5f116b45688e5c9289983298ff0b177fe9ca02b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-key-value-aio \
python3.13dist-py-key-value-aio \
python313-py-key-value-aio \
python3dist-py-key-value-aio"

RDEPENDS:${PN} += "python-abi \
python313-aiofile \
python313-anyio \
python313-beartype \
python313-cachetools \
python313-keyring"

inherit rpm
