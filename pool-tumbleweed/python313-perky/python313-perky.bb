SUMMARY = "A parser for the perky text file format"
DESCRIPTION = "An 'rcfile' text file format for Python programs solving the same \
problem as 'INI' files, 'TOML' files, and 'JSON' files."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python313-perky-0.10-1.1.noarch.rpm"
RPM_HASH = "b22d11b941fc56ecbf57aec596be4f72dc7fc3590435fd60a27ac61e0c8d2b8180b41d5e16a08c9e2b9120173dc2694cb7a5604e2254571ef8fd2728ae5e44f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-perky \
python3.13dist-perky \
python313-perky \
python3dist-perky"

RDEPENDS:${PN} += "python-abi \
python313-big"

inherit rpm
