SUMMARY = "Pure Python client SASL implementation"
DESCRIPTION = "This package provides a reasonably high-level SASL client written \
in pure Python.  New mechanisms may be integrated easily, but by default, \
support for PLAIN, ANONYMOUS, CRAM-MD5, DIGEST-MD5, and GSSAPI are \
provided."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python314-pure-sasl-0.6.2-2.5.noarch.rpm"
RPM_HASH = "5641451f4fbc865ab571f4ee28ec4a23aa981f4a1284ded08219885d77b9ac4a935828a027834146be665e4b24b5d8a4a18c306323f429ed30d149174e4c9be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pure-sasl \
python314-pure-sasl \
python3dist-pure-sasl"

RDEPENDS:${PN} += "python-abi \
python314-kerberos"

inherit rpm
