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

RPM_NAME = "python314-hatch-1.18.0-1.1.noarch.rpm"
RPM_HASH = "0c1fe72ed2812cf04565bc9fe2b97557dffd0ca588013c227c8fc838506ca9bbf9e34b475887fc2db6d5f368d47a42457ea29d534c526ce938be69608de5b1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch \
python314-hatch \
python3dist-hatch"

RDEPENDS:${PN} += "-python314-pexpect >= 4.8 with python314-pexpect < 5 \
-python314-userpath >= 1.7 with python314-userpath < 2 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
git-core \
python-abi \
python314-click \
python314-distro \
python314-hatchling \
python314-httpx2 \
python314-hyperlink \
python314-keyring \
python314-packaging \
python314-platformdirs \
python314-pyproject-hooks \
python314-python-discovery \
python314-rich \
python314-shellingham \
python314-tomli-w \
python314-tomlkit \
python314-uv \
python314-virtualenv"

inherit rpm
