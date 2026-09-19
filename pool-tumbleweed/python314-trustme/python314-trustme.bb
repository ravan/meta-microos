SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.1"

RPM_NAME = "python314-trustme-1.2.1-1.8.noarch.rpm"
RPM_HASH = "1074dd73a89e55c88a259e8c36f96cbec946683de04e952167606b8feb0b1db6c97906bbdc71a845c68bb6bba7b02c1502b6a73b17c6dc90c46d78bc2ac3abd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-trustme \
python314-trustme \
python3dist-trustme"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-idna"

inherit rpm
