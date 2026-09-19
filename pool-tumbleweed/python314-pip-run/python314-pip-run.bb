SUMMARY = "Install packages and run Python with them"
DESCRIPTION = "On-demand temporary package installation for a single interpreter run. \
 \
pip-run is not intended to solve production dependency management, \
but does aim to address the other, one-off scenarios around dependency management \
  - trials and experiments \
  - build setup \
  - test runners \
  - just in time script running \
  - interactive development \
  - bug triage \
 \
pip-run is a compliment to Pip and Virtualenv and Setuptools, intended to more \
readily address the on-demand needs."
LICENSE = "MIT"

PV = "16.1.0"

RPM_NAME = "python314-pip-run-16.1.0-2.3.noarch.rpm"
RPM_HASH = "9e152cfa854fdb8dcd256af327261bf92ea42369b624ee4edba91b036c8e679cbb5e0a8c89d26e1a7c3cf79c1b24c49b1adcf31b71b40ed588d1c7b5e42374f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pip-run \
python314-pip-run \
python3dist-pip-run"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-autocommand \
python314-coherent.deps \
python314-jaraco.context \
python314-jaraco.env \
python314-jaraco.functools \
python314-more-itertools \
python314-packaging \
python314-path \
python314-pip \
python314-platformdirs \
python314-tempora"

inherit rpm
