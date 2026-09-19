SUMMARY = "Python wrapper module around the OpenSSL library"
DESCRIPTION = "pyOpenSSL is a set of Python bindings for OpenSSL.  It includes some low-level \
cryptography APIs but is primarily focused on providing an API for using the \
TLS protocol from Python. \
 \
pyOpenSSL is now a pure-Python project with a dependency on a new project, \
cryptography (<https://github.com/pyca/cryptography>), which provides (among \
other things) a cffi-based interface to OpenSSL."
LICENSE = "Apache-2.0"

PV = "26.4.0"

RPM_NAME = "python313-pyOpenSSL-26.4.0-1.1.noarch.rpm"
RPM_HASH = "82c2af760c1d33e8c4f6f195d634141ecbc42741150c14932c8e8b3405bbef2d53e6fc62176d7e734da123c5a8257f0535a22ed31ea432daf8bf413110dec3c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyOpenSSL \
pyopenssl \
python3-pyOpenSSL \
python3.13dist-pyopenssl \
python313-pyOpenSSL \
python3dist-pyopenssl"

RDEPENDS:${PN} += "-python313-cryptography >= 49.0.0 with python313-cryptography < 51 \
python-abi \
python313-cffi"

inherit rpm
