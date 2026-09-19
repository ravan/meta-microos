SUMMARY = "HTTP library inspired by python-requests"
DESCRIPTION = "treq is an HTTP library inspired by requests but written on top of Twisted’s Agents. \
It provides a simple, higher level API for making HTTP requests when using Twisted."
LICENSE = "MIT"

PV = "25.5.0"

RPM_NAME = "python314-treq-25.5.0-1.2.noarch.rpm"
RPM_HASH = "0098b46cf4c564c5122875d73ff9d6fbc0da8d786e1850b399ec8dcebde917c0edbf172b34098df3cd47bbdfc33e3303a6179047d3fa9c991eb30dc214903f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-treq \
python314-treq \
python3dist-treq"

RDEPENDS:${PN} += "python-abi \
python314-Twisted-tls \
python314-attrs \
python314-hyperlink \
python314-incremental \
python314-multipart \
python314-requests \
python314-typing-extensions"

inherit rpm
