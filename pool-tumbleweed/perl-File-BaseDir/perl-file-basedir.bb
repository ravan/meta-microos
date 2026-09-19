SUMMARY = "Use the Freedesktop.org base directory specification"
DESCRIPTION = "This module can be used to find directories and files as specified by the \
Freedesktop.org Base Directory Specification. This specifications gives a \
mechanism to locate directories for configuration, application data and \
cache data. It is suggested that desktop applications for e.g. the GNOME, \
KDE or Xfce platforms follow this layout. However, the same layout can just \
as well be used for non-GUI applications. \
 \
This module forked from File::MimeInfo. \
 \
This module follows version 0.6 of BaseDir specification."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.90.0"

RPM_NAME = "perl-File-BaseDir-0.90.0-1.5.noarch.rpm"
RPM_HASH = "4aa7158b29fa344e1a0ca8feaa2d9420c8db9e2405c0054e999e5e554291b9ef5c9bdc8f4443b9a3e6a42d25b23d9131d058c090002fdc2841936ae71db1cc73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--BaseDir \
perl-File--IconTheme \
perl-File--UserDirs \
perl-File-BaseDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IPC--System--Simple"

inherit rpm
