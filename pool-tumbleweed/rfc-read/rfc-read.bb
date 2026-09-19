SUMMARY = "Read RFCs from the command-line"
DESCRIPTION = "A tool written in Bash to read RFCs from the command-line. It fetches RFCs and drafts from the Web and caches them locally."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "rfc-read-2.0.1-1.1.noarch.rpm"
RPM_HASH = "914b2e96fd2e1301af5d5618b6bd46984a0f29cfb23153d2e96f384318d8763d5ff11421c69ab3616327d033eec8d1c55b7108b34f6f9fdd31fc32f38597cded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rfc-read"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
less"

inherit rpm
