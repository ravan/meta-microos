SUMMARY = "Core library for anymarkup"
DESCRIPTION = "This is the core library that implements functionality of \
python-anymarkup."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python313-anymarkup-core-0.8.1-4.5.noarch.rpm"
RPM_HASH = "9cc6565168b5e009df4197b41e91f4115ff19a2ffb94e2b9955d326967946e36f064c94e11df4d3642a952db940b3ce11e93c1e9e3a8f72841e18c66929346bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anymarkup-core \
python3.13dist-anymarkup-core \
python313-anymarkup-core \
python3dist-anymarkup-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
