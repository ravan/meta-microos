SUMMARY = "Python-based FIDO 2.0 library"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for communicating \
with a USB authenticator via the Client-to-Authenticator Protocol (CTAP 1 and 2). \
In addition to this low-level device access, classes defined in the fido2.client \
implement higher level device operations."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "2.1.1"

RPM_NAME = "python313-fido2-2.1.1-1.3.noarch.rpm"
RPM_HASH = "4caeb43db951fc88b113ab2fb4b6a2f185cf84757a39d190941e37c49403af773eef11ec75da65d878fec0a791d46f1ed7500af21c3e904f8fa2c9ca0fd4afa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fido2 \
python3.13dist-fido2 \
python313-fido2 \
python3dist-fido2"

RDEPENDS:${PN} += "python-abi \
python313-cryptography"

inherit rpm
