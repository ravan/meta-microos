SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.11.1"

RPM_NAME = "python313-gssapi-1.11.1-1.5.aarch64.rpm"
RPM_HASH = "addf7724ba1f30d04138cacfcb518db4dd01afd67430fbda791473ae4e859bae5160ff81c9b6a59508bdb8c9d833348af0c08b58ee690d77875223e7f3090e58"

RPROVIDES:${PN} += "python3-gssapi \
python3.13dist-gssapi \
python313-gssapi \
python3dist-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
python313-decorator"

inherit rpm
