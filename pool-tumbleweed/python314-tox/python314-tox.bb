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

RPM_NAME = "python314-tox-4.34.1-1.4.noarch.rpm"
RPM_HASH = "601732c8b0c2cf99340f8dc0b8e51ca508b04d2731301ee678c2a8e3356c2742477feebc14e2d0521917a04e9906db17dda44cf88c69d7ac238b6e6080d1e2ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tox \
python314-detox \
python314-tox \
python3dist-tox"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-cachetools \
python314-chardet \
python314-colorama \
python314-filelock \
python314-packaging \
python314-platformdirs \
python314-pluggy \
python314-pyproject-api \
python314-virtualenv \
update-alternatives"

inherit rpm
