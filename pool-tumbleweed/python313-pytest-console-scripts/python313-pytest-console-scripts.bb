SUMMARY = "Pytest plugin for testing console scripts"
DESCRIPTION = "Pytest-console-scripts is a `Pytest`_ plugin for testing python scripts \
installed via ``console_scripts`` entry point of ``setup.py``. It can run the \
scripts under test in a separate process or using the interpreter that's \
running the test suite.  The former mode ensures that the script will run in an \
environment that is identical to normal execution whereas the latter one allows \
much quicker test runs during development while simulating the real runs as \
much as possible."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python313-pytest-console-scripts-1.4.1-3.10.noarch.rpm"
RPM_HASH = "2ae76929fe7db926f410277544d87c416b2504c17a464b2d16a657f13d0fe4a72a95dc6a9785ea13aa701bcc052267d3dd640d357b9a7c6f3aeb26d2364b889d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-console-scripts \
python3.13dist-pytest-console-scripts \
python313-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
