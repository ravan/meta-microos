SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.3.0"

RPM_NAME = "python313-requests_ntlm-1.3.0-1.9.noarch.rpm"
RPM_HASH = "dff96f6b47260c94d7cc134548c1ea7cc21540ee6665d779d413f05699b776000ea81866d28823aac961b8cc6f227d74ee811721476f067790274b719101bc0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-ntlm \
python3.13dist-requests-ntlm \
python313-requests-ntlm \
python3dist-requests-ntlm"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-pyspnego \
python313-requests"

inherit rpm
