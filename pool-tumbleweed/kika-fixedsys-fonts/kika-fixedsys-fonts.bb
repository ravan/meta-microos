SUMMARY = "The 'Fixedsys Excelsior' font"
DESCRIPTION = "A TrueType (vector) font similar to Windows 2.x/3.x Fixedsys, \
enhanced with Unicode symbols."
LICENSE = "SUSE-Public-Domain"

PV = "3.09.10"

RPM_NAME = "kika-fixedsys-fonts-3.09.10-1.2.noarch.rpm"
RPM_HASH = "3f79a83ddca891a72e81037911562162aacb10b527421dcecff40b1eb7d35fb7734afe985a93e4ce9688d8b9c4e4e2718d7f8c924088cb8552fe3e4f6b9667e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kika-fixedsys-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
