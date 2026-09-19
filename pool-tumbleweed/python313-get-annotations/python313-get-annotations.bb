SUMMARY = "A backport of Python 3.10's inspectget_annotation() function"
DESCRIPTION = "A backport of Python 3.10's inspectget_annotation() function."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-get-annotations-0.1.2-1.11.noarch.rpm"
RPM_HASH = "95aa67388d5ba8f764f5e7c0accae4ad6aa9b519528cf12a7e18aef11b3db1366a7d37dc45c9883fcc69cfb469eb79b36f57391bd27459ead01dfd60f71eebe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-get-annotations \
python3.13dist-get-annotations \
python313-get-annotations \
python3dist-get-annotations"

RDEPENDS:${PN} += "python-abi"

inherit rpm
