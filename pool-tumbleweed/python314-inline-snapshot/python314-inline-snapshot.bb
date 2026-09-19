SUMMARY = "Create and update inline snapshots in your Python code"
DESCRIPTION = "Create and update inline snapshots in your Python code."
LICENSE = "MIT"

PV = "0.35.4"

RPM_NAME = "python314-inline-snapshot-0.35.4-1.1.noarch.rpm"
RPM_HASH = "8b22de3dc40111a2fcbee56387768cc46c742e331a4bc0efc0008cfc1166fcf547ec7ea8b4ba823218f5e77db9596d224c644d26ecd940f0dadf7b89a0605565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-inline-snapshot \
python314-inline-snapshot \
python3dist-inline-snapshot"

RDEPENDS:${PN} += "python-abi \
python314-asttokens \
python314-executing \
python314-pytest \
python314-rich \
python314-typing-extensions"

inherit rpm
