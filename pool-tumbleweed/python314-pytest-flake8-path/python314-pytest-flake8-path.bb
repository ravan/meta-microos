SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python314-pytest-flake8-path-1.7.0-1.2.noarch.rpm"
RPM_HASH = "9155859e3ac0caaaf3a09d1fd6593dab4a8f26f594b159db4be5200a3c31cdff7f56d20966467f39a0ab94a875dd57c26ccfcf35b990761aaeee164337c73851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-flake8-path \
python314-pytest-flake8-path \
python3dist-pytest-flake8-path"

RDEPENDS:${PN} += "python-abi \
python314-flake8 \
python314-pytest"

inherit rpm
