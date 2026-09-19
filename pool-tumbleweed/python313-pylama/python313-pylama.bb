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

RPM_NAME = "python313-pylama-8.4.1-3.11.noarch.rpm"
RPM_HASH = "11b14b5fd0e7620e4facb59fe61bca60d1cb7834291dd85c109a5deadcbb660dc4f2896e9911b07f9481bb920812f90fbfb4d50f24c46adef9ad0cf2db81db11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylama \
python3.13dist-pylama \
python313-pylama \
python3dist-pylama"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-mccabe \
python313-pycodestyle \
python313-pydocstyle \
python313-pyflakes \
update-alternatives"

inherit rpm
