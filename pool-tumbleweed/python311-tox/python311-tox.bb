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

RPM_NAME = "python311-tox-4.27.0-1.1.noarch.rpm"
RPM_HASH = "3d596127353ed3539689f9ba43773af8bb1fb5868e3b872b453d798140339e6304833a68c25b2d150b6e47b473f25d3a63783cd6e0ab8cdaa63da266972d72dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tox \
python311-detox \
python311-tox \
python3dist-tox"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cachetools \
python311-chardet \
python311-colorama \
python311-filelock \
python311-packaging \
python311-platformdirs \
python311-pluggy \
python311-pyproject-api \
python311-virtualenv \
update-alternatives"

inherit rpm
