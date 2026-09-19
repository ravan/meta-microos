SUMMARY = "Python XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "python313-xapp-2.4.2-3.5.noarch.rpm"
RPM_HASH = "77282e977f2529bc574020cb7b74dea20993edfba17de35c981fbbc15d44a5a0374e9863131f3ecbf0d384d4d6c1a7220785626fb42992970c21e83de9c9b8d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xapp \
python3.13dist-python-xapp \
python313-xapp \
python3dist-python-xapp"

RDEPENDS:${PN} += "python-abi \
python313-psutil \
xdg-utils"

inherit rpm
