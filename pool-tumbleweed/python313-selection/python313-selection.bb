SUMMARY = "API to extract content from HTML & XML documents"
DESCRIPTION = "API to extract content from HTML & XML documents"
LICENSE = "MIT"

PV = "0.0.21"

RPM_NAME = "python313-selection-0.0.21-1.14.noarch.rpm"
RPM_HASH = "037c60f3e6703a18e9cb02523834720f1e37a15caf1f211d82bed70d6baca84951cc582837d5d0630147212e21b0319ee7e5e0d467b3548f786c42796ba761c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-selection \
python3.13dist-selection \
python313-selection \
python3dist-selection"

RDEPENDS:${PN} += "python-abi \
python313-lxml"

inherit rpm
