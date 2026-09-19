SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "25.11.29"

RPM_NAME = "python313-flake8-bugbear-25.11.29-1.2.noarch.rpm"
RPM_HASH = "dfa7595239399f21e8f974a166f196a32c3536be4d11988b794ea1e14b053354cca98e0a0fecd8082453057ecba91628cc7acf7ee8d8564fd8e58a3d3a684306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-bugbear \
python3.13dist-flake8-bugbear \
python313-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-flake8"

inherit rpm
