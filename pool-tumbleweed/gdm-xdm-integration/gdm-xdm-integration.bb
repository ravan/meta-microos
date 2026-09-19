SUMMARY = "GDM integration into the xdm wrapper script"
DESCRIPTION = "GDM's XDM wrapper integration \
By default openSUSE uses xdm which enables the DM based on sysconfig."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gdm-xdm-integration-50.3-1.1.noarch.rpm"
RPM_HASH = "3aafe4759b5d4b5e872d3ddc634e99e002cd7e6779ea8fda59ef192e69890738ed9205a66e3fda388b4f3b6ef3aa43745a302ccb659659604867a0794ed50203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-xdm-integration"

RDEPENDS:${PN} += "/usr/bin/sh \
gdm \
update-alternatives \
xdm"

inherit rpm
