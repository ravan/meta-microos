SUMMARY = "Virtualenv-based automation of test activities"
DESCRIPTION = "Tox as is a generic virtualenv management and test command line tool you can \
use for: \
 \
* checking your package installs correctly with different \
  Python versions and interpreters \
 \
* running your tests in each of the \
  environments, configuring your test tool of choice \
 \
* acting as a frontend to Continuous Integration \
  servers, greatly reducing boilerplate and merging \
  CI and shell-based testing."
LICENSE = "MIT"

PV = "4.34.1"

RPM_NAME = "python313-tox-4.34.1-1.4.noarch.rpm"
RPM_HASH = "70d9d0ee850750417aec63fda0e869be59a2f4c971c0a6975bd3e586872971261d62f0d026dcbf1baa82338dd9bc0a0cb8b0dc9932a6da1ceb3f3a7df02ac1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-detox \
python3-tox \
python3.13dist-tox \
python313-detox \
python313-tox \
python3dist-tox \
tox"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-cachetools \
python313-chardet \
python313-colorama \
python313-filelock \
python313-packaging \
python313-platformdirs \
python313-pluggy \
python313-pyproject-api \
python313-virtualenv \
update-alternatives"

inherit rpm
