SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "6.2.0"

RPM_NAME = "python314-pyfakefs-6.2.0-1.2.noarch.rpm"
RPM_HASH = "fab4f33113ee519918b5ec40a5c047ffc842c45bec9a3c87519197e57ad354caa5780641cab7410a871faf9014a9d84010968a17606abf2334be266f3a9ce13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyfakefs \
python314-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
