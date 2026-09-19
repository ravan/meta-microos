SUMMARY = "HTTP library inspired by python-requests"
DESCRIPTION = "treq is an HTTP library inspired by requests but written on top of Twisted’s Agents. \
It provides a simple, higher level API for making HTTP requests when using Twisted."
LICENSE = "MIT"

PV = "25.5.0"

RPM_NAME = "python313-treq-25.5.0-1.2.noarch.rpm"
RPM_HASH = "ed717ec8d6735fdff08969923adcb6a60e457d2d904ac000d04136a3bb3e107c9fbdbc6aafd2df4c8675e5666f8618efdd2ea6ad27450e1dcfc56bb46a8dbc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-treq \
python3.13dist-treq \
python313-treq \
python3dist-treq"

RDEPENDS:${PN} += "python-abi \
python313-Twisted-tls \
python313-attrs \
python313-hyperlink \
python313-incremental \
python313-multipart \
python313-requests \
python313-typing-extensions"

inherit rpm
