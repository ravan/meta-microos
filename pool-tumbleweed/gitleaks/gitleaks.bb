SUMMARY = "Protect and discover secrets using Gitleaks"
DESCRIPTION = "Gitleaks is a SAST tool for detecting and preventing hardcoded secrets like \
passwords, api keys, and tokens in git repos. Gitleaks is an easy-to-use, \
all-in-one solution for detecting secrets, past or present, in your code."
LICENSE = "MIT"

PV = "8.30.1"

RPM_NAME = "gitleaks-8.30.1-1.4.aarch64.rpm"
RPM_HASH = "fd45e73e68d2690bef801c4bc6bbb8b6b308c66c95f6744f46d02e87d90d650e2180f582c2687d1bb8a8ec8bf89c3b8fa46e89ddd3cf7d1dd0f8e050212d3e87"

RPROVIDES:${PN} += "gitleaks"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
