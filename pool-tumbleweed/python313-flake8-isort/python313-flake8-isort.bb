SUMMARY = "Plugin integrating isort in flake8"
DESCRIPTION = "Use `isort`_ to check if the imports on your python files are sorted the way you expect."
LICENSE = "GPL-2.0-only"

PV = "7.0.0"

RPM_NAME = "python313-flake8-isort-7.0.0-1.5.noarch.rpm"
RPM_HASH = "131ffdca8c5c58544288f79c21fe2ca1b41f31f343978cafec3d442c8647e15b04a3586a74a2ce002c07488d731966125ffa1eb35ff12c56ba2f253c9488fc46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-isort \
python3.13dist-flake8-isort \
python313-flake8-isort \
python3dist-flake8-isort"

RDEPENDS:${PN} += "python-abi \
python313-flake8 \
python313-isort \
python313-testfixtures"

inherit rpm
