SUMMARY = "Code audit tool for python"
DESCRIPTION = "Code audit tool for Python. Pylama wraps these tools: \
 \
- pycodestyle (formerly pep8) © 2012-2013, Florent Xicluna; \
- pydocstyle (formerly pep257 by Vladimir Keleshev) © 2014, Amir Rachum; \
- PyFlakes © 2005-2013, Kevin Watters; \
- Mccabe © Ned Batchelder; \
- Pylint © 2013, Logilab; \
- Radon © Michele Lacchia \
- eradicate © Steven Myint; \
- Mypy © Jukka Lehtosalo and contributors; \
- Vulture © Jendrik Seipp and contributors;"
LICENSE = "MIT"

PV = "8.4.1"

RPM_NAME = "python314-pylama-8.4.1-3.11.noarch.rpm"
RPM_HASH = "f86f859956699774d329653afcffe1e6581a3140f81b9e2671b579279c6d9512474812a4771aa014c1320027440b437c233eda654888b2aca9c38b1cd799e855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylama \
python314-pylama \
python3dist-pylama"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-mccabe \
python314-pycodestyle \
python314-pydocstyle \
python314-pyflakes \
update-alternatives"

inherit rpm
