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

RPM_NAME = "python314-pytest-console-scripts-1.4.1-3.10.noarch.rpm"
RPM_HASH = "355a519de5f5e3bc9d83452ed4a71b8310b1ae564e34303bd9029ee06a9188a3e290e4d942fd19c198304002af9beec498485c74ded18ea03fd67e2aecdd7a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-console-scripts \
python314-pytest-console-scripts \
python3dist-pytest-console-scripts"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
