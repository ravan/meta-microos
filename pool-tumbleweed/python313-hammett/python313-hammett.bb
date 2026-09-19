SUMMARY = "Fast python test runner"
DESCRIPTION = "Hammett is a fast python test runner that aims to be compatible with the parts \
of pytest most people use (unless that conflicts with the goal of being fast)."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python313-hammett-0.10.0-2.8.noarch.rpm"
RPM_HASH = "592e26a03a5f357d665b729052331a85db277518a0aac51e6c3b8981f7a834155c5902eac3ce2173cd6c6860fafeda6ef0f8d3b23556684ff0cf0bffb61b25f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hammett \
python3.13dist-hammett \
python313-hammett \
python3dist-hammett"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
