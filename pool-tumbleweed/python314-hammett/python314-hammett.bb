SUMMARY = "Fast python test runner"
DESCRIPTION = "Hammett is a fast python test runner that aims to be compatible with the parts \
of pytest most people use (unless that conflicts with the goal of being fast)."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python314-hammett-0.10.0-2.8.noarch.rpm"
RPM_HASH = "adf78eab53b5cd8f97c5859bf9df0a5184c2597f95cea95045df11a0cf7f945256969d37352f13526bac9e3f6d7559018af566b68665ded009afa161769816f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hammett \
python314-hammett \
python3dist-hammett"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
