SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.9.0"

RPM_NAME = "python313-pexpect-4.9.0-5.1.noarch.rpm"
RPM_HASH = "ae999135d15e971d2d8d3d122e3de844521b60456d5949996bf5e62b3ef73c1bd25337bfe67483da3b5da9f532cab04a78c4ec6d9159b996a49dd036d6ce641f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pexpect \
python3.13dist-pexpect \
python313-pexpect \
python3dist-pexpect"

RDEPENDS:${PN} += "python-abi \
python313-ptyprocess"

inherit rpm
