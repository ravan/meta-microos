SUMMARY = "A Docker client for Python, designed to be fun and intuitive!"
DESCRIPTION = "A Docker client for Python, designed to be fun and intuitive!"
LICENSE = "MIT"

PV = "0.67.0"

RPM_NAME = "python314-python-on-whales-0.67.0-1.2.noarch.rpm"
RPM_HASH = "879ac0a4bac7f8d6cde1d024a6024dd65eafdc992f3c4d3fb221d7fded66e1a748f08e06e1eda1cb9155dc9de6cceb9e006cfa695b18f231ab5981661b53be89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-on-whales \
python314-python-on-whales \
python3dist-python-on-whales"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pydantic \
python314-requests \
python314-tqdm \
python314-typer \
python314-typing-extensions"

inherit rpm
