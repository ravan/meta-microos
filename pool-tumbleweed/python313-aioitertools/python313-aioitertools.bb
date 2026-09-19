SUMMARY = "Itertools and builtins for AsyncIO and mixed iterables"
DESCRIPTION = "Implementation of itertools, builtins, and more for AsyncIO and mixed-type iterables."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python313-aioitertools-0.13.0-1.4.noarch.rpm"
RPM_HASH = "d52ed6d26be8fb4703ed2ae88a463eb2bada9c99d4077c92eeb1d82ea7cbba3bf8af72e4a05d13e4472f6d0fcb8d4be671683a08230250dfc01a6793986f7053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioitertools \
python3.13dist-aioitertools \
python313-aioitertools \
python3dist-aioitertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
