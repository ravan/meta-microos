SUMMARY = "A FUSE file system for accessing Open Build Service instances"
DESCRIPTION = "oscfs is a FUSE-based user space file system for accessing Open \
Build Service (OBS) instances. It is based on the osc (openSUSE Commander) \
Python package for interfacing with OBS. At the moment, it provides read-only \
access for inspecting packages and their metadata."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.1"

RPM_NAME = "fuse-oscfs-0.9.1-1.4.noarch.rpm"
RPM_HASH = "aa9abadf0053c64eebc4b434606e49fec112bde8abbc7cbd341c05cd2559525cc26dbcd6a59a9a9de2197a7c6cd1dbf666db6c3acaa46c832999339e77017531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fuse-oscfs \
python2-oscfs \
python3.13dist-oscfs \
python3dist-oscfs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
osc \
python-abi \
python3-fusepy"

inherit rpm
