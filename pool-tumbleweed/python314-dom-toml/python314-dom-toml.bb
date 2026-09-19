SUMMARY = "Dom's tools for Tom's Obvious, Minimal Language"
DESCRIPTION = "Dom's tools for Tom's Obvious, Minimal Language."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python314-dom-toml-2.3.0-1.2.noarch.rpm"
RPM_HASH = "d8abf20de5721261a003e8dce5e39e33690910dce8e4e1a89859c467cb4b11d92bc694d014010db36cec7163c381bd31fdc640f7e7a5983ea8eb1364293d1348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dom-toml \
python314-dom-toml \
python3dist-dom-toml"

RDEPENDS:${PN} += "python-abi \
python314-domdf-python-tools \
python314-tomli-w"

inherit rpm
