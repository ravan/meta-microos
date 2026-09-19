SUMMARY = "Standard Webhooks"
DESCRIPTION = "Standard Webhooks"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-standardwebhooks-1.0.1-1.3.noarch.rpm"
RPM_HASH = "7768898547e70216fa299548f851a0c56a16baf1f197714a4b0d73391ec3349ec09b0cfb9aaa6e36c5e04a70bc463ee2b1bad4c4254204888155638b9eb5e0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-standardwebhooks \
python314-standardwebhooks \
python3dist-standardwebhooks"

RDEPENDS:${PN} += "python-abi \
python314-Deprecated \
python314-attrs \
python314-httpx \
python314-python-dateutil"

inherit rpm
