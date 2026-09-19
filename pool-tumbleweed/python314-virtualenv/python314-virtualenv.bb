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

RPM_NAME = "python314-virtualenv-21.3.3-1.3.noarch.rpm"
RPM_HASH = "d16cda35750bf4d913750c7b131d090bc5e7014a969a4f11c1c53524a9ee139fcd9faffb782663e5f1371e1d4048d3aad9783aa43d49ae978376587651ca07a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-virtualenv \
python314-virtualenv \
python3dist-virtualenv"

RDEPENDS:${PN} += "-python314-distlib >= 0.3.7 with python314-distlib < 1 \
-python314-filelock >= 3.20.3 with python314-filelock < 4 \
-python314-platformdirs >= 3.9.1 with python314-platformdirs < 5 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-python-discovery"

inherit rpm
