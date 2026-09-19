SUMMARY = "Twisted bindings for ZeroMQ"
DESCRIPTION = "txZMQ allows to integrate ZeroMQ sockets into Twisted event loop (reactor). \
It supports both CPython and PyPy, and ZeroMQ library versions 2.2.x or 3.2.x."
LICENSE = "MPL-2.0"

PV = "1.0.0"

RPM_NAME = "python314-txZMQ-1.0.0-2.5.noarch.rpm"
RPM_HASH = "281fdb954256fcd2c1543af2899e7864e7fc88761b41ab9929f9798b9a50031d19d11e3a3abca2389a3e0fd1e5b5153344edb5c6ddcb2c2092544ab53645d22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-txzmq \
python314-txZMQ \
python3dist-txzmq"

RDEPENDS:${PN} += "python-abi \
python314-Twisted \
python314-pyzmq"

inherit rpm
