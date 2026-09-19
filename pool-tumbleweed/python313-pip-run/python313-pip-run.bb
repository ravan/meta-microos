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

RPM_NAME = "python313-pip-run-16.1.0-2.3.noarch.rpm"
RPM_HASH = "505548d1ac2f83644384b4c14113d13014ab9c0d3021b8b330d365f7aa05ea29a87f8c6d30e6e541f4d7b8d5d0b20b224122b46cccc024a47352a92699d4b543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-run \
python3.13dist-pip-run \
python313-pip-run \
python3dist-pip-run"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-autocommand \
python313-coherent.deps \
python313-jaraco.context \
python313-jaraco.env \
python313-jaraco.functools \
python313-more-itertools \
python313-packaging \
python313-path \
python313-pip \
python313-platformdirs \
python313-tempora"

inherit rpm
