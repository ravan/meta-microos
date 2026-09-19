SUMMARY = "Stateful programmatic web browsing"
DESCRIPTION = "Stateful programmatic web browsing in Python. Browse pages \
programmatically with HTML form filling and clicking \
of links."
LICENSE = "BSD-3-Clause & (BSD-3-Clause | ZPL-2.1)"

PV = "0.4.10"

RPM_NAME = "python313-mechanize-0.4.10-3.5.noarch.rpm"
RPM_HASH = "41609619de8342ea2fbf7c742f56719173412a8fffea20c6872f436013aa5ce34d91f6801037d93035d99b9a321ea969b59e2a9823bbb240df053126f6a9effc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mechanize \
python3.13dist-mechanize \
python313-mechanize \
python3dist-mechanize"

RDEPENDS:${PN} += "python-abi \
python313-html5lib"

inherit rpm
