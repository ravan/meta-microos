SUMMARY = "Binary dependency utility"
DESCRIPTION = "Bindep is a tool for checking the presence of binary packages needed to \
use an application / library. It started life as a way to make it easier to set \
up a development environment for OpenStack projects. While OpenStack depends \
heavily on `pip` for installation of Python dependencies, some dependencies are \
not Python based, and particularly for testing, some dependencies have to be \
installed before `pip` can be used - such as `virtualenv` and `pip` itself."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-bindep-2.14.0-1.2.noarch.rpm"
RPM_HASH = "a61f535611b59e082bb5e0539121bc3137660bab4d9e47fd762a8251ada1e3e74d671db2658c71cc83f0f5d51c350191475c496455a0cb1d4904952776ae95e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bindep \
python3.13dist-bindep \
python313-bindep \
python3dist-bindep"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Parsley \
python313-distro \
python313-packaging \
python313-pbr"

inherit rpm
