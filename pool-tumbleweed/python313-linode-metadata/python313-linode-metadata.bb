SUMMARY = "A client to interact with the Linode Metadata service in Python"
DESCRIPTION = "A client to interact with the Linode Metadata service in Python."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python313-linode-metadata-0.3.5-1.2.noarch.rpm"
RPM_HASH = "f3a0ca20b68e1a080de88f463e0925f1bac6393f4bf10462a9a4f47c733d0be4b1758d41b7320f75f497229246ecbe1718dd24128a4841e0cc9fe202e9640237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linode-metadata \
python3.13dist-linode-metadata \
python313-linode-metadata \
python3dist-linode-metadata"

RDEPENDS:${PN} += "python-abi \
python313-httpx"

inherit rpm
