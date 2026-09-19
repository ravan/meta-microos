SUMMARY = "Modular source code checker: pep8, pyflakes and co"
DESCRIPTION = "Flake8 is a modular extensible source code checker including wrappers \
around these tools: \
 \
- PyFlakes \
- pep8 \
- Ned Batchelder's McCabe script \
 \
Flake8 runs all the tools by launching the single ``flake8`` script."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "python313-flake8-7.3.0-2.5.noarch.rpm"
RPM_HASH = "1eba8cf8d55a296aa3906dd7504dc27f01238d8ab3dc7ba1d5e9e71877ccdfb8feeb3ac6d98e12b94ff6bf572c6666ce89f04077075187e2b21dbd7622e5c447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8 \
python3.13dist-flake8 \
python313-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python313-mccabe >= 0.7.0 with python313-mccabe < 0.8.0 \
-python313-pycodestyle >= 2.14.0 with python313-pycodestyle < 2.15.0 \
-python313-pyflakes >= 3.4.0 with python313-pyflakes < 3.5.0 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
