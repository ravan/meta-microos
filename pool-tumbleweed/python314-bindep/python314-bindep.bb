SUMMARY = "Binary dependency utility"
DESCRIPTION = "Bindep is a tool for checking the presence of binary packages needed to \
use an application / library. It started life as a way to make it easier to set \
up a development environment for OpenStack projects. While OpenStack depends \
heavily on `pip` for installation of Python dependencies, some dependencies are \
not Python based, and particularly for testing, some dependencies have to be \
installed before `pip` can be used - such as `virtualenv` and `pip` itself."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-bindep-2.14.0-1.2.noarch.rpm"
RPM_HASH = "089da14cb4e8d46908f011e3b8a683e91501e28270f3c94b1850b5e047c39d608ba3ae2c2414fc2760670914b5ab75e02b4a55f93ab7dad1c6585255bb1abd57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bindep \
python314-bindep \
python3dist-bindep"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Parsley \
python314-distro \
python314-packaging \
python314-pbr"

inherit rpm
