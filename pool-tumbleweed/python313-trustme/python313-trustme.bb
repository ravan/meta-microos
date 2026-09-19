SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.1"

RPM_NAME = "python313-trustme-1.2.1-1.8.noarch.rpm"
RPM_HASH = "4a8675dabf3954c92792ed99bb9ae071562e01982c2e7803c7f1eaa6bd721c41a6860322cfca1074af875cdea008a247b9f30ace56ede7c588a004511033a5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trustme \
python3.13dist-trustme \
python313-trustme \
python3dist-trustme"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-idna"

inherit rpm
