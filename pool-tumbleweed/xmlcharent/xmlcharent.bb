SUMMARY = "XML Character Entities"
DESCRIPTION = "XML encodings for the 19 standard character entity sets defined in \
non-normative Annex D of [ISO 8879:1986]."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "xmlcharent-0.3-429.12.noarch.rpm"
RPM_HASH = "0b3b3f019afa29e5506535ab458f066cee093fc6f1bb8ce831988f92152e54ef4e575131d143f5ed0967a05bb9a262451f7a046e284945b47cbc81cd5023cb2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlcharent"

RDEPENDS:${PN} += "/usr/bin/sh \
sgml-skel"

inherit rpm
