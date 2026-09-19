SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.11.1"

RPM_NAME = "python314-gssapi-1.11.1-1.5.aarch64.rpm"
RPM_HASH = "1e3fd3b86e3031d900f1a5c2109f82b230ac1c3506780ef935e7a427db59f66b35dff266cdefabdc99be29902888ae7ce2474922314d43a2b03350c7789b0f21"

RPROVIDES:${PN} += "python3.14dist-gssapi \
python314-gssapi \
python3dist-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
python314-decorator"

inherit rpm
