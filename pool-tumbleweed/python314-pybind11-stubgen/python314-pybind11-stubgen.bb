SUMMARY = "PEP 561 type stubs generator for pybind11 modules"
DESCRIPTION = "Generate stubs for python modules.  There are several tweaks to target \
specifically modules compiled using pybind11"
LICENSE = "BSD-3-Clause"

PV = "2.5.5"

RPM_NAME = "python314-pybind11-stubgen-2.5.5-1.5.noarch.rpm"
RPM_HASH = "42ccd19d8f15cc0f483b85c8823a84fced14e18714b463b94f06a7c31fcbcab2c3e54e9e25f385ff5a2ff08744acb323ffcc60867a186cfa91059833dbab1552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pybind11-stubgen \
python314-pybind11-stubgen \
python3dist-pybind11-stubgen"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
