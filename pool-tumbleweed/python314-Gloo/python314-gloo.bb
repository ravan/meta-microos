SUMMARY = "Project management for data analysis projects"
DESCRIPTION = "Gloo ties together a lot of the data analysis actions that happen \
regularly. It automatically loads data into the IPython environment, \
runs scripts, makes utitlity functions available and more."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python314-Gloo-0.1.2-5.5.noarch.rpm"
RPM_HASH = "88ef23973a94b8b053100476203da070d83d1dd5c3dcc7df32df5e78401b1dbbe84c50dd1aad9224168b27d2f808ad23ea28c5f34b3e286599658bc629a1aa1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gloo \
python314-Gloo \
python3dist-gloo"

RDEPENDS:${PN} += "python-abi \
python314-pandas"

inherit rpm
