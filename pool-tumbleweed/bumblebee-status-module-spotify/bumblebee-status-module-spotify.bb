SUMMARY = "Widget to display spotify"
DESCRIPTION = "Displays a spotify widget."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-spotify-2.1.5-4.7.noarch.rpm"
RPM_HASH = "88f2532fb89895700ddc49ae2e96a718dd41977d4d688b4555dc7edbf8a5fb08f94526364d50b8f9ef8912476b5f5aebad9a695d46e347b0bda6af735d50ef7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-spotify"

RDEPENDS:${PN} += "bumblebee-status \
python3-dbus-python \
spotify-easyrpm"

inherit rpm
