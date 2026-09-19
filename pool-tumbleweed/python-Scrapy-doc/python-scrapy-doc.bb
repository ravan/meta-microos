SUMMARY = "Documentation for python-Scrapy"
DESCRIPTION = "Provides documentation for python-Scrapy."
LICENSE = "BSD-3-Clause"

PV = "2.17.0+git7"

RPM_NAME = "python-Scrapy-doc-2.17.0+git7-1.1.noarch.rpm"
RPM_HASH = "3a4685d736093eac32c4af93023df6f316b8037c55e03331661204d1926dbb1d1f6d16b8a2a4bb716c7518de04df3ef3d93c2712fb595639e66b9469fd5a31a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Scrapy-doc"

RDEPENDS:${PN} += ""

inherit rpm
