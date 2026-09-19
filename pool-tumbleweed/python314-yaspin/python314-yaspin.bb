SUMMARY = "Yet Another Terminal Spinner"
DESCRIPTION = "Yet Another Terminal Spinner."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python314-yaspin-3.4.0-1.4.noarch.rpm"
RPM_HASH = "157ad830b98b3ea46ac3cabb0c73274784965dac2dd388c3fe9dcc705e74c3314116335aa7dbf6b8695f244a71a219a7b9ff8c04b0682b5c849aa398077f838f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yaspin \
python314-yaspin \
python3dist-yaspin"

RDEPENDS:${PN} += "python-abi \
python314-termcolor"

inherit rpm
