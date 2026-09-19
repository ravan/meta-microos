SUMMARY = "User/System Xsession Desktop File"
DESCRIPTION = "This package contains the System desktop file which will cause \
the execution of a user provided $HOME/.xsession script or pick \
the system wide DM default set in /etc/sysconfig/displaymanager."
LICENSE = "MIT"

PV = "1.1.17"

RPM_NAME = "xdm-xsession-1.1.17-5.3.aarch64.rpm"
RPM_HASH = "fe0982d9759007679f4e970816530d8c57c1dfffce866d27d85ec7e6a75fc7ea3e3574e7b8143ea006a5ef0744d6273601b21f6cf39230bdc6b190088a31b040"

RPROVIDES:${PN} += "xdm-xsession"

RDEPENDS:${PN} += "xdm"

inherit rpm
