SUMMARY = "Project management for data analysis projects"
DESCRIPTION = "Gloo ties together a lot of the data analysis actions that happen \
regularly. It automatically loads data into the IPython environment, \
runs scripts, makes utitlity functions available and more."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python313-Gloo-0.1.2-5.5.noarch.rpm"
RPM_HASH = "21d25daabb866548b3946e79fb8c4bcac3ea54e5040008beca37c1ecd80d00f653b215c47604e1846ef57c9c35de0a475e74b3f0c0dc1a9720161c0d0ff8a3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Gloo \
python3.13dist-gloo \
python313-Gloo \
python3dist-gloo"

RDEPENDS:${PN} += "python-abi \
python313-pandas"

inherit rpm
