SUMMARY = "A library for automatically generating command line interfaces"
DESCRIPTION = "Python Fire is a library for automatically generating command line \
interfaces (CLIs) from a Python object."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python314-fire-0.7.1-2.4.noarch.rpm"
RPM_HASH = "facd43cacf3dfaf0790b70b0913eb73b15f24c258655bdb732a9ee0f8e5e0f6d07ff632eb516765de254ce156fc11ccf28b865ddb7e816e9bb1e1600e1e2043f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fire \
python314-fire \
python3dist-fire"

RDEPENDS:${PN} += "python-abi \
python314-termcolor"

inherit rpm
