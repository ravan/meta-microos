SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "9.0.34"

RPM_NAME = "python314-phonenumbers-9.0.34-1.1.noarch.rpm"
RPM_HASH = "0dabe5f9fead99e5c0d51a86e51af667ef04dc1b39cb7223b1cf5517785d7be0dfeb7e181c059a00aa822701afbd7f1505e1e5c6b85fe2c34754c6d7364203d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-phonenumbers \
python314-phonenumbers \
python314-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
