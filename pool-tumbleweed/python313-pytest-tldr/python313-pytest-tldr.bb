SUMMARY = "A pytest plugin that limits the output to just the things you need"
DESCRIPTION = "A pytest plugin that limits the output to just the things you need."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "python313-pytest-tldr-0.2.5-4.4.noarch.rpm"
RPM_HASH = "6e860c299a622b002d17181373740d33675df6ba5966c73d7219d07f2c5c2c8d5bb6816f3f757a19618e889dd1a9f4e00368c39a31c251ed3be71d84a017c4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tldr \
python3.13dist-pytest-tldr \
python313-pytest-tldr \
python3dist-pytest-tldr"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
