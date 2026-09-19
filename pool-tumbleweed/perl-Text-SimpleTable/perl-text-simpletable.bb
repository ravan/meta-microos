SUMMARY = "Simple Eyecandy ASCII Tables"
DESCRIPTION = "Simple eyecandy ASCII tables."
LICENSE = "Artistic-2.0"

PV = "2.07"

RPM_NAME = "perl-Text-SimpleTable-2.07-1.26.noarch.rpm"
RPM_HASH = "681fe247135247e0fecf9291f330b13a1f06d6e62d911f06dabb3f4874a52b06160631821d59659ed61d4f3d6c6a323d340508158e884d56d9f48ffda3908fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SimpleTable \
perl-Text-SimpleTable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
