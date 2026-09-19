SUMMARY = "Javadoc for time-api"
DESCRIPTION = "This package contains javadoc for time-api."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LicenseRef-SUSE-Public-Domain"

PV = "0.6.4"

RPM_NAME = "time-api-javadoc-0.6.4-5.2.noarch.rpm"
RPM_HASH = "330117cc8baca8d8c8f4fdf1ac9ee62521813fc9f60ca52aee001a8828be98e6f41b663859cd7c705c209d4cb4952da09c30490dad60e0201c090aeea85928e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "time-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
