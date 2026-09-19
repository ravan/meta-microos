SUMMARY = "TransIP API Connector"
DESCRIPTION = "This library implements part of the TransIP API in Python."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python313-transip-2.1.2-5.5.noarch.rpm"
RPM_HASH = "f254934ff618aa888c262bfbf74b4641709518a809bebb925ef119f79322f1b5bb747535a67fbe6c6bd105c6d71975c18d25b02ce58c481c87f9881059c905e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transip \
python3.13dist-transip \
python313-transip \
python3dist-transip"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-cryptography \
python313-requests \
python313-suds \
update-alternatives"

inherit rpm
