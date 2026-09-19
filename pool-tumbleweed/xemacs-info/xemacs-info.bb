SUMMARY = "Info Files for XEmacs"
DESCRIPTION = "This package contains all info files for XEmacs. All these files can be \
read online with XEmacs and describe XEmacs and some of its modes."
LICENSE = "GPL-3.0-or-later"

PV = "21.5.36"

RPM_NAME = "xemacs-info-21.5.36-1.1.noarch.rpm"
RPM_HASH = "ea4c13e09c8c014bb020e808f6fa68c21781e5811a406187535682a935889c2a0e2a4399cd52d7dd21e1cbf1f91a0bef6bebb2a820afde86b0b9f298636658ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-info"

RDEPENDS:${PN} += "xemacs-packages-info"

inherit rpm
