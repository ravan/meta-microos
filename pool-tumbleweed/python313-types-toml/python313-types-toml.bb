SUMMARY = "Typing stubs for toml"
DESCRIPTION = "Typing stubs for toml."
LICENSE = "Apache-2.0"

PV = "0.10.8.20240310"

RPM_NAME = "python313-types-toml-0.10.8.20240310-1.9.noarch.rpm"
RPM_HASH = "76ea801269baa06436de490cfe6915ed465a2249edd82dc23fc13a386413cc898dca31b129ff031665ae8f0a2578bc48439f0112e956e483f7934b5c95217184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-types-toml \
python3.13dist-types-toml \
python313-types-toml \
python3dist-types-toml"

RDEPENDS:${PN} += ""

inherit rpm
