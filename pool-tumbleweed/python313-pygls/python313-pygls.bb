SUMMARY = "A pythonic generic language server"
DESCRIPTION = "pygls (pronounced like 'pie glass') is a pythonic generic \
implementation of the Language Server Protocol for use as a \
foundation for writing your own Language Servers in just a few \
lines of code."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python313-pygls-2.1.1-1.2.noarch.rpm"
RPM_HASH = "896e08f98ee8b7e0b3cfd265380030ef9650b965e9492cfaf53a730387576362f51ee6e6a54ff090424bc04d0ac363cc83512cd1b590eae7ddb20ce9e3cd4632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygls \
python3.13dist-pygls \
python313-pygls \
python3dist-pygls"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-cattrs \
python313-lsprotocol \
python313-websockets"

inherit rpm
