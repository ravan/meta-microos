SUMMARY = "A consistent AST for Python"
DESCRIPTION = "A library for a stable Abstract Syntax Tree for Python."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python313-synr-0.6.0-3.2.noarch.rpm"
RPM_HASH = "6ae92572a4a9180361b84c65bc3ad610206ac535c515933b6251b8d60b43fd8dddf6dc6733e2bb841fc164a991e6ecf1dafbf8beb65914f04d5a574b82f833ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-synr \
python3.13dist-synr \
python313-synr \
python3dist-synr"

RDEPENDS:${PN} += "python-abi \
python313-attrs"

inherit rpm
