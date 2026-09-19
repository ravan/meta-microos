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

RPM_NAME = "python314-flake8-7.3.0-2.5.noarch.rpm"
RPM_HASH = "82dfdb720bf8f5f3542e33e216e0651068fe373902fd377f333addff8db756f0984516e215d3da3881907bd782393149ec71e33d532721344cce68901e2bb41f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8 \
python314-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python314-mccabe >= 0.7.0 with python314-mccabe < 0.8.0 \
-python314-pycodestyle >= 2.14.0 with python314-pycodestyle < 2.15.0 \
-python314-pyflakes >= 3.4.0 with python314-pyflakes < 3.5.0 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
