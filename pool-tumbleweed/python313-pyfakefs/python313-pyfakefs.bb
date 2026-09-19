SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "6.2.0"

RPM_NAME = "python313-pyfakefs-6.2.0-1.2.noarch.rpm"
RPM_HASH = "0b1faceb60075045ac89fd03489dadd5c9de1731719bcfe4d6c35352d43985482621bd5ceee359d3716c301f50c9fdd5628f9dde53c58fa97ca826c727e86ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfakefs \
python3.13dist-pyfakefs \
python313-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
