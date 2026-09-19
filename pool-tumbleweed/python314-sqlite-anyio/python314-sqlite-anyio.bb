SUMMARY = "Asynchronous client for SQLite using AnyIO"
DESCRIPTION = "Asynchronous client for SQLite using AnyIO \
Originally from https://gist.github.com/agronholm/458637aa569720fb1305cc74347e3e1d"
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python314-sqlite-anyio-0.2.3-1.10.noarch.rpm"
RPM_HASH = "6c8d476f3835f0981e29fd93a526e8cad54141ae8481334a02a2c39903721d367ee6d07940bef1e16b94abedb341fef03f531c2177c6e455002fdd8f9b325ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sqlite-anyio \
python314-sqlite-anyio \
python3dist-sqlite-anyio"

RDEPENDS:${PN} += "-python314-anyio >= 4.0 with python314-anyio < 5 \
python-abi \
python314-sqlite3"

inherit rpm
