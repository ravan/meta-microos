SUMMARY = "SIL Yi Font"
DESCRIPTION = "The Nuosu SIL Font is a single Unicode font for the standardized \
Yi script used by a large ethnic group in southwestern China."
LICENSE = "OFL-1.1"

PV = "2.300"

RPM_NAME = "nuosu-fonts-2.300-1.9.noarch.rpm"
RPM_HASH = "0ebfa2b0c5a3a4929d7f1b231b5e3fa70b46324d7220f239bf9ca42e3cecba00c122d4f05953026ceefc3b5b3c4ec6cf5d33c614c6acc67916e03ecab4ec8fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nuosu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
