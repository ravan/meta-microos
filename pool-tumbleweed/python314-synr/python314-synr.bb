SUMMARY = "A consistent AST for Python"
DESCRIPTION = "A library for a stable Abstract Syntax Tree for Python."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python314-synr-0.6.0-3.2.noarch.rpm"
RPM_HASH = "dc627fdcf6947f6cdcd6bacbc26163a75b58bc517462a05b82ae9c599533b4354aae4614d62169ccacdfb660c25c01420fc997ef8409bff26cc2220107024125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-synr \
python314-synr \
python3dist-synr"

RDEPENDS:${PN} += "python-abi \
python314-attrs"

inherit rpm
