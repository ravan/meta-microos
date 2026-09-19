SUMMARY = "File IDs for documents in a running Jupyter Server"
DESCRIPTION = "A Jupyter Server extension providing an implementation of the File ID service."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python313-jupyter-server-fileid-0.9.3-1.8.noarch.rpm"
RPM_HASH = "dab217efc128fc97b5f289217066c97ea93931210f008f86d693b9375f6dffe633973bff6422aa7c90242f45bd90d6279321bedc63d7d7182f693a3bc71649cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-fileid \
python3.13dist-jupyter-server-fileid \
python313-jupyter-server-fileid \
python3dist-jupyter-server-fileid"

RDEPENDS:${PN} += "-python313-jupyter-server >= 1.15 with python313-jupyter-server < 3 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
jupyter-server-fileid \
python-abi \
python313-jupyter-events"

inherit rpm
