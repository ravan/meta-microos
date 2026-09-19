SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.15.0"

RPM_NAME = "python313-requests-kerberos-0.15.0-1.9.noarch.rpm"
RPM_HASH = "f82383470203ea169d49854e597688a8e4fe66e15a081293722627546dd592a420db0b5efc774b2ce1bd865c3ff8e26c47d19fdd13b69d77e864963e71798a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-kerberos \
python3.13dist-requests-kerberos \
python313-requests-kerberos \
python3dist-requests-kerberos"

RDEPENDS:${PN} += "python-abi \
python313-pyspnego \
python313-requests"

inherit rpm
