SUMMARY = "Openbox KDE integration"
DESCRIPTION = "This package provides openbox KDE integration and tools"
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-kde-3.6.1-5.12.aarch64.rpm"
RPM_HASH = "027a4809b67e78efcf017c09e357e95e7c5414fc1e42d4c4b80c65497a4ee47315e0e9727a9be75f88776f614b3c23ada297845f9a8376850b7f9c3145482f66"

RPROVIDES:${PN} += "openbox-kde"

RDEPENDS:${PN} += "/usr/bin/sh \
openbox"

inherit rpm
