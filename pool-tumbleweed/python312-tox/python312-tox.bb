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

PV = "4.27.0"

RPM_NAME = "python312-tox-4.27.0-1.1.noarch.rpm"
RPM_HASH = "f3dd7caa94c1cff7fa13042fa9790a99fc6c7697e7d701a10cff387722be5ae9f2bd148abbaae9642b75bc68b4c0ebddb4182043679b3cc4c388f29b59e73d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-tox \
python312-detox \
python312-tox \
python3dist-tox"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-cachetools \
python312-chardet \
python312-colorama \
python312-filelock \
python312-packaging \
python312-platformdirs \
python312-pluggy \
python312-pyproject-api \
python312-virtualenv \
update-alternatives"

inherit rpm
