SUMMARY = "Python-based FIDO 2.0 library"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for communicating \
with a USB authenticator via the Client-to-Authenticator Protocol (CTAP 1 and 2). \
In addition to this low-level device access, classes defined in the fido2.client \
implement higher level device operations."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "2.1.1"

RPM_NAME = "python314-fido2-2.1.1-1.3.noarch.rpm"
RPM_HASH = "8cbac8e250ee1a59120cd1d1f0fb92dd390aaa8f5522d49b16b021a42997a9fd4f500a594a952a8bcb0c0bf54a94f0962f95cb0c8ae7382f043314dab1b72b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fido2 \
python314-fido2 \
python3dist-fido2"

RDEPENDS:${PN} += "python-abi \
python314-cryptography"

inherit rpm
