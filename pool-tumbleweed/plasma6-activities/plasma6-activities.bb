SUMMARY = "Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-activities-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "3f6b39cb85d7156d8d7bcdbb43397365a72c60e1415246c3a331dd5a2f30f792c37bcc25ea42f62e5e93a46e6814058c00ec6f9eef33cce34bf9ee02f7a4e12b"

RPROVIDES:${PN} += "plasma6-activities"

RDEPENDS:${PN} += ""

inherit rpm
