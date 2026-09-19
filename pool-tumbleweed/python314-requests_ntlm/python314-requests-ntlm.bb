SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.3.0"

RPM_NAME = "python314-requests_ntlm-1.3.0-1.9.noarch.rpm"
RPM_HASH = "b4afc68fb7b1e533301374b8ab82a37b6cbcd7f6ec1136e65b09fce7ee307b64f7c88ee0a9eb37b38138aaa5d3e70a5ebcedc35844353055d19bac5336207f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-ntlm \
python314-requests-ntlm \
python3dist-requests-ntlm"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-pyspnego \
python314-requests"

inherit rpm
