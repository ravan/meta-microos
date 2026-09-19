SUMMARY = "Virtual Python Environment builder"
DESCRIPTION = "virtualenv is a tool to create isolated Python environments. \
The basic problem being addressed is one of dependencies and versions, and \
indirectly permissions. Imagine you have an application that needs version 1 \
of LibFoo, but another application requires version 2. \
 \
Or more generally, what if you want to install an application and leave it be? \
If an application works, any change in its libraries or the versions of those \
libraries can break the application. \
 \
Also, what if you cant install packages into the global site-packages \
directory? For instance, on a shared host. \
 \
In all these cases, virtualenv can help you. It creates an environment that \
has its own installation directories, that doesnt share libraries with other \
virtualenv environments (and optionally doesnt use the globally installed \
libraries either)."
LICENSE = "MIT"

PV = "21.3.3"

RPM_NAME = "python313-virtualenv-21.3.3-1.3.noarch.rpm"
RPM_HASH = "7e148bc8594919abac9325bc406c62f5cc2bf9c9a9edf65fe5d61b3ec26305b74b35bbe4bd56cf0b44ecba5f1e31b07db8d2da1067af86b39fefa1bc2563fe9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtualenv \
python3.13dist-virtualenv \
python313-virtualenv \
python3dist-virtualenv"

RDEPENDS:${PN} += "-python313-distlib >= 0.3.7 with python313-distlib < 1 \
-python313-filelock >= 3.20.3 with python313-filelock < 4 \
-python313-platformdirs >= 3.9.1 with python313-platformdirs < 5 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-python-discovery"

inherit rpm
