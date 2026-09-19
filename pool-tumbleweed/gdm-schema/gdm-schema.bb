SUMMARY = "Config schema for GDM"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gdm-schema-50.3-1.1.noarch.rpm"
RPM_HASH = "e8c9b2a34459fa5ea243054c03fa45c421291acd3025bc1b9624b0e204b1f7b9fc854a9c5462ca3d8fef814ce581da16dbdca10da855476359d7f8c3d795b4bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-schema"

RDEPENDS:${PN} += ""

inherit rpm
