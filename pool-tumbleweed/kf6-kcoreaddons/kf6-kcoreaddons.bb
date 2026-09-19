SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcoreaddons-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "b610e2fd81ccc249c2ae79a815cbd686e794019a8d23d92443937230ff80a050d660eb4272d2ca3fd0ac9a72ca54d933eb9510ba6dbd7614d77b1180c5e972df"

RPROVIDES:${PN} += "kf6-kcoreaddons"

RDEPENDS:${PN} += "shared-mime-info"

inherit rpm
