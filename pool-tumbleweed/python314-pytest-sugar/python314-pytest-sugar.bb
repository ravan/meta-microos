SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python314-pytest-sugar-1.1.1-2.4.noarch.rpm"
RPM_HASH = "389bd5b462939440967419d4c5842198f0fa4b6609b8ddb91a52646dd60e4912c53187f62bf8ae6dc07df046ed47865d414222b993fe6a9c4c3f3f823f3a216a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-sugar \
python314-pytest-sugar \
python3dist-pytest-sugar"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-termcolor"

inherit rpm
