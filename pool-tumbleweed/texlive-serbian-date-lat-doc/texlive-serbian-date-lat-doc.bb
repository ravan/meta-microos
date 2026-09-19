SUMMARY = "Documentation for texlive-serbian-date-lat"
DESCRIPTION = "This package includes the documentation for texlive-serbian-date-lat"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn23446"

RPM_NAME = "texlive-serbian-date-lat-doc-2026.226.svn23446-60.2.noarch.rpm"
RPM_HASH = "2a308decc4e4951a73082d6d36e71319084358c20236b9bf1b2d1b69d9aaf69fd8a15941c95f33ddeb61bda82aa61246a716d206e7c9ae123eb666e9cbf9c126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-date-lat-doc"

RDEPENDS:${PN} += ""

inherit rpm
