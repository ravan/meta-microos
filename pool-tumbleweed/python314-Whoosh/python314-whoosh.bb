SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.5"

RPM_NAME = "python314-Whoosh-2.7.5-1.5.noarch.rpm"
RPM_HASH = "7946c5c000534faec6e8193eb5effb6e3d6cf9b017485c88b713ae6bc3dd3cde77073dcdc08afbbc621e59fe8e8c695c26cdc043e28886ee956ecfd06aa5949b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-whoosh-reloaded \
python314-Whoosh \
python3dist-whoosh-reloaded"

RDEPENDS:${PN} += "python-abi \
python314-cached-property"

inherit rpm
