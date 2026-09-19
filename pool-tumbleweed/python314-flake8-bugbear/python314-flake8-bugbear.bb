SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "25.11.29"

RPM_NAME = "python314-flake8-bugbear-25.11.29-1.2.noarch.rpm"
RPM_HASH = "ae08f689a4598726b2662cc71e87be423696e32af86fa6c5302f11377fef10fa2b21aa587820507078e7a87c356eafb8702d2b2fc20c13258acb181c52886cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-bugbear \
python314-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-flake8"

inherit rpm
