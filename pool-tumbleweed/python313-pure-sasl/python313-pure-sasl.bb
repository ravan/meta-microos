SUMMARY = "Pure Python client SASL implementation"
DESCRIPTION = "This package provides a reasonably high-level SASL client written \
in pure Python.  New mechanisms may be integrated easily, but by default, \
support for PLAIN, ANONYMOUS, CRAM-MD5, DIGEST-MD5, and GSSAPI are \
provided."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python313-pure-sasl-0.6.2-2.5.noarch.rpm"
RPM_HASH = "9236a6139f308d8fe128ded10704edb836458198fae2e835a16214b26c5a8008f8da4a907e99c70137c03449c20a59abcd453504935e1361fe00d60c511a962e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pure-sasl \
python3.13dist-pure-sasl \
python313-pure-sasl \
python3dist-pure-sasl"

RDEPENDS:${PN} += "python-abi \
python313-kerberos"

inherit rpm
