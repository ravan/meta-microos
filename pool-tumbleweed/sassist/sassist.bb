SUMMARY = "Dell SupportAssist log collector"
DESCRIPTION = "Dell SupportAssist log collector for Linux."
LICENSE = "MIT"

PV = "0.8.7"

RPM_NAME = "sassist-0.8.7-2.4.noarch.rpm"
RPM_HASH = "21d3f60f2304a179a3f9223bca32f98b45f2217aba59e4fff7b19160e55145b5c2012a914e53596ec6051348bf9859d0ae7738c5e5202294d535f186b9f8ede7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sassist"

RDEPENDS:${PN} += "/usr/bin/sh \
freeipmi \
supportutils \
zip"

inherit rpm
