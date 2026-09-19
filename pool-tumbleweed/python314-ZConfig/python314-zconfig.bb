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

RPM_NAME = "python314-ZConfig-4.3-1.4.noarch.rpm"
RPM_HASH = "888e845e9f1b8101ba1afe8a68d9bff72eb568a8dfac4191719fded0861db9a08ae69c16c85afd9441293c252c55461655219258f96653b412e156e15a469204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zconfig \
python314-ZConfig \
python3dist-zconfig"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
