SUMMARY = "Plugin integrating isort in flake8"
DESCRIPTION = "Use `isort`_ to check if the imports on your python files are sorted the way you expect."
LICENSE = "GPL-2.0-only"

PV = "7.0.0"

RPM_NAME = "python314-flake8-isort-7.0.0-1.5.noarch.rpm"
RPM_HASH = "9de6eecc436f5c51296d19672480c7c42c3745dfcf1165b71f399603f241ebbaf546b317faac728e35adf77093ef021d67e3b50db05e61832bfeb1643513a66b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-isort \
python314-flake8-isort \
python3dist-flake8-isort"

RDEPENDS:${PN} += "python-abi \
python314-flake8 \
python314-isort \
python314-testfixtures"

inherit rpm
