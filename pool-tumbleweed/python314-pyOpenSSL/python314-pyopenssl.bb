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

RPM_NAME = "python314-pyOpenSSL-26.4.0-1.1.noarch.rpm"
RPM_HASH = "8e589c892d6465e1bda8bdf13502eb96f3b015629b86cdccd58aa51e7e2e5b6564f214fdd13fba64c9cf6f8db4d258906093986fa2badf4bcaa0b7f3c3c45e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyOpenSSL \
pyopenssl \
python3.14dist-pyopenssl \
python314-pyOpenSSL \
python3dist-pyopenssl"

RDEPENDS:${PN} += "-python314-cryptography >= 49.0.0 with python314-cryptography < 51 \
python-abi \
python314-cffi"

inherit rpm
