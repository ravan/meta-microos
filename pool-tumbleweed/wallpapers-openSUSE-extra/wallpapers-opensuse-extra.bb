SUMMARY = "openSUSE Extra Wallpapers"
DESCRIPTION = "Extra wallpapers for openSUSE Leap 16"
LICENSE = "CC-BY-2.0 & CC-BY-SA-2.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "16"

RPM_NAME = "wallpapers-openSUSE-extra-16-2.2.noarch.rpm"
RPM_HASH = "4546d59f86d429d7cd88fb6d0dbeb4be0fcee2e2718e43cb1073bf07c7dc63250cfc6ae0b5abaec26cd96b62d8f2fb184a63f14d09ec455cd1f5957e22c505bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-wallpapers \
wallpapers-openSUSE-extra"

RDEPENDS:${PN} += ""

inherit rpm
