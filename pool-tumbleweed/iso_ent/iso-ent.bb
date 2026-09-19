SUMMARY = "Character Entity Sets for ISO 8879:1986"
DESCRIPTION = "ISO 8879:1986 and ISO 9573-15:1993 character entity sets"
LICENSE = "SUSE-Permissive"

PV = "2000.11.03"

RPM_NAME = "iso_ent-2000.11.03-831.2.noarch.rpm"
RPM_HASH = "2446a1e973c9c2eff83e6ca294fc96d1b0e465e5e26303dc9853804b35166a90510c58ea5477f1059bb42b302f05290e3b6ec02f572e42467c1cea9deb82be05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-ent \
iso-entities"

RDEPENDS:${PN} += "/usr/bin/sh \
sgml-skel"

inherit rpm
