SUMMARY = "A jQuery-like library for python"
DESCRIPTION = "Pyquery allows you to make jQuery queries on XML documents. The API is \
as much as possible the similar to jQuery. Pyquery uses lxml for fast \
XML and HTML manipulation."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python314-pyquery-2.1.0-1.1.noarch.rpm"
RPM_HASH = "22ccb1dbd75db3bfc9a08949e69c6eac70e0c1a3f69e11b56b76a89232f540b9be353b2504c116a1978be50f3648d26148b03c5d975a60eb4fe631b2e635f080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyquery \
python314-pyquery \
python3dist-pyquery"

RDEPENDS:${PN} += "python-abi \
python314-cssselect \
python314-lxml"

inherit rpm
