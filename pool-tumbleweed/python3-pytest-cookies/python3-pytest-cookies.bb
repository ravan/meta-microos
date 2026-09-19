SUMMARY = "Cookiecutter template pytest plugin"
DESCRIPTION = "The pytest plugin for your Cookiecutter templates."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python3-pytest-cookies-0.7.0-2.9.noarch.rpm"
RPM_HASH = "b1672d988f6bfdc23eeb7218d97478fe69282c7d2e6d78f08cb12de405e58da9d5be931c52e9a3022629a2dc4d4e2ca6af5eab159cba506a028bf85d629a20ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cookies \
python3.13dist-pytest-cookies \
python3dist-pytest-cookies"

RDEPENDS:${PN} += "cookiecutter \
python-abi \
python3-pytest"

inherit rpm
