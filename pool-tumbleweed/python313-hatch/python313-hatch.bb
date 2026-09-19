SUMMARY = "Modern, extensible Python project management"
DESCRIPTION = "Hatch is a modern, extensible Python project manager. \
 \
Features \
  * Standardized build system with reproducible builds by default \
  * Robust environment management with support for custom scripts \
  * Easy publishing to PyPI or other indexes \
  * Version management \
  * Configurable project generation with sane defaults \
  * Responsive CLI, ~2-3x faster than equivalent tools"
LICENSE = "MIT"

PV = "1.18.0"

RPM_NAME = "python313-hatch-1.18.0-1.1.noarch.rpm"
RPM_HASH = "275a8c87b03d5036df930dddb4d91d8ffcbb70bbb55db428da4ba7221c90e961c2cef3275b27dcc7ccc57596b5320c5f8fa0ec46a40e7eca1b006739eb5117cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch \
python3.13dist-hatch \
python313-hatch \
python3dist-hatch"

RDEPENDS:${PN} += "-python313-pexpect >= 4.8 with python313-pexpect < 5 \
-python313-userpath >= 1.7 with python313-userpath < 2 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
git-core \
python-abi \
python313-backports.zstd \
python313-click \
python313-distro \
python313-hatchling \
python313-httpx2 \
python313-hyperlink \
python313-keyring \
python313-packaging \
python313-platformdirs \
python313-pyproject-hooks \
python313-python-discovery \
python313-rich \
python313-shellingham \
python313-tomli-w \
python313-tomlkit \
python313-uv \
python313-virtualenv"

inherit rpm
