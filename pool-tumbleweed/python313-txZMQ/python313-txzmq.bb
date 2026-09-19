SUMMARY = "Twisted bindings for ZeroMQ"
DESCRIPTION = "txZMQ allows to integrate ZeroMQ sockets into Twisted event loop (reactor). \
It supports both CPython and PyPy, and ZeroMQ library versions 2.2.x or 3.2.x."
LICENSE = "MPL-2.0"

PV = "1.0.0"

RPM_NAME = "python313-txZMQ-1.0.0-2.5.noarch.rpm"
RPM_HASH = "686340dd344f119ac9f1b714bb2a0581b2d9ca3621c41534dbbb26087d4163858b2782d984fb8956784c3c4be515a5a7f18f7c72a03c8a744cb0ceb6fc177761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txZMQ \
python3.13dist-txzmq \
python313-txZMQ \
python3dist-txzmq"

RDEPENDS:${PN} += "python-abi \
python313-Twisted \
python313-pyzmq"

inherit rpm
