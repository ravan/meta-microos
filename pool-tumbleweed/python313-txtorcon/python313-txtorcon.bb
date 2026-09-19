SUMMARY = "Twisted-based asynchronous Tor control protocol implementation"
DESCRIPTION = "Twisted-based asynchronous Tor control protocol implementation. Includes \
unit-tests, examples, state-tracking code and configuration abstraction."
LICENSE = "MIT"

PV = "26.6.0"

RPM_NAME = "python313-txtorcon-26.6.0-1.2.noarch.rpm"
RPM_HASH = "7ef8dfcb8368bf3b52ebab7a5439d91962e0900f989f7fcae8d3a1391f42e1f236e48794a5e078580a7164210a9c8e4c98040bf2cca22dff34c5d839a45a5950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txtorcon \
python3.13dist-txtorcon \
python313-txtorcon \
python3dist-txtorcon"

RDEPENDS:${PN} += "python-abi \
python313-Automat \
python313-Twisted-tls \
python313-cryptography \
python313-zope.interface"

inherit rpm
