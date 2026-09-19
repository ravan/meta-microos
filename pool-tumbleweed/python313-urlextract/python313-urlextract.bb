SUMMARY = "Collects and extracts URLs from given text"
DESCRIPTION = "Collects and extracts URLs from given text."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python313-urlextract-1.9.0-3.5.noarch.rpm"
RPM_HASH = "50b7b7993dd910b9165316e6c7c50ea6e03fd3738ae5b48c6f50d5fd1cfdc2b836313561c662e42d7433be451e5901386e17577d2bc08be21de61ffa6375afdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urlextract \
python3.13dist-urlextract \
python313-urlextract \
python3dist-urlextract"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-dnspython \
python313-filelock \
python313-idna \
python313-platformdirs \
python313-uritools \
update-alternatives"

inherit rpm
