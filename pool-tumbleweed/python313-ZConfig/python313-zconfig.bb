SUMMARY = "Structured Configuration Library"
DESCRIPTION = "ZConfig is a configuration library intended for general use. It supports a \
hierarchical schema-driven configuration model that allows a schema to specify \
data conversion routines written in Python. ZConfig's model is very different \
from the model supported by the ConfigParser module found in Python's standard \
library, and is more suitable to configuration-intensive applications. \
 \
ZConfig schema are written in an XML-based language and are able to 'import' \
schema components provided by Python packages. Since components are able to \
bind to conversion functions provided by Python code in the package (or \
elsewhere), configuration objects can be arbitrarily complex, with values that \
have been verified against arbitrary constraints. This makes it easy for \
applications to separate configuration support from configuration loading even \
with configuration data being defined and consumed by a wide range of separate \
packages."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python313-ZConfig-4.3-1.4.noarch.rpm"
RPM_HASH = "6dee590fc3952d45a24a796c49b0e4b6a81cbeb5b0b705fdd1e08de15fb43e98bc36e24578eb613a8eb2921e1e333f486d9ce6a110b8a2fc63084ee94b9d033c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZConfig \
python3.13dist-zconfig \
python313-ZConfig \
python3dist-zconfig"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
