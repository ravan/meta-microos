SUMMARY = "Module to handle .desktop files"
DESCRIPTION = "This module is designed to work with _.desktop_ files. The format of these \
files is specified by the freedesktop 'Desktop Entry' specification. This \
module can parse these files but also knows how to run the applications \
defined by these files. \
 \
For this module version 1.0 of the specification was used. \
 \
This module was written to support File::MimeInfo::Applications. \
 \
Please remember: case is significant for the names of Desktop Entry keys."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.230.0"

RPM_NAME = "perl-File-DesktopEntry-0.230.0-1.3.noarch.rpm"
RPM_HASH = "c563c4328e83bdccaba046a5c4a6fb08796f415e8eb01d59287c451ab6226fdc30505ce0d0100f75989d469a6697d0dc21653faaaff77fc494b6436122e86118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--DesktopEntry \
perl-File-DesktopEntry"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--BaseDir \
perl-URI--Escape"

inherit rpm
