SUMMARY = "Twisted-based asynchronous Tor control protocol implementation"
DESCRIPTION = "Twisted-based asynchronous Tor control protocol implementation. Includes \
unit-tests, examples, state-tracking code and configuration abstraction."
LICENSE = "MIT"

PV = "26.6.0"

RPM_NAME = "python314-txtorcon-26.6.0-1.2.noarch.rpm"
RPM_HASH = "954cf9f18aaaef1ce935ed11b6a2ecc2e68171f03607182874a18e4ea47ff4bb76d8353ad22493ee171fc6855a8739dc04bf0b44402e5ff9fb24904ceb6f0791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-txtorcon \
python314-txtorcon \
python3dist-txtorcon"

RDEPENDS:${PN} += "python-abi \
python314-Automat \
python314-Twisted-tls \
python314-cryptography \
python314-zope.interface"

inherit rpm
