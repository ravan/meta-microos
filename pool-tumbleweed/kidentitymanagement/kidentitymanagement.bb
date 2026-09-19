SUMMARY = "KDE PIM Libraries: Identity Management"
DESCRIPTION = "This package provides a library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kidentitymanagement-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a012a2f11ad1da56ed302bf44b99eae4dcead41e7298799d22534f5ae62a436ae9953fcde882daf9996e4b4b25e0a717aa6ea4ca6a4e3c809336785c25a99567"

RPROVIDES:${PN} += "kidentitymanagement"

RDEPENDS:${PN} += ""

inherit rpm
