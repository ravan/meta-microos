SUMMARY = "Asynchronous client for SQLite using AnyIO"
DESCRIPTION = "Asynchronous client for SQLite using AnyIO \
Originally from https://gist.github.com/agronholm/458637aa569720fb1305cc74347e3e1d"
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python313-sqlite-anyio-0.2.3-1.10.noarch.rpm"
RPM_HASH = "ad402e214aaa5663e7bfd0dfcda65bf5cf299dea9840c6cfce059ffe0090934d6eee44553f00783a0887d1d00dec3d0b1a030f05111bb7605d7d9065d79c4f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite-anyio \
python3.13dist-sqlite-anyio \
python313-sqlite-anyio \
python3dist-sqlite-anyio"

RDEPENDS:${PN} += "-python313-anyio >= 4.0 with python313-anyio < 5 \
python-abi \
python313-sqlite3"

inherit rpm
