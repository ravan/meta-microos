SUMMARY = "A pythonic generic language server"
DESCRIPTION = "pygls (pronounced like 'pie glass') is a pythonic generic \
implementation of the Language Server Protocol for use as a \
foundation for writing your own Language Servers in just a few \
lines of code."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python314-pygls-2.1.1-1.2.noarch.rpm"
RPM_HASH = "132ecf247f2628d357dc4e39028f138c840e7de0b9d39db910a297505039f29b6f64417228d6de8899ef06d12a822be8f4f9bdd2c0f6df8564c2f21023dd2942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygls \
python314-pygls \
python3dist-pygls"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-cattrs \
python314-lsprotocol \
python314-websockets"

inherit rpm
