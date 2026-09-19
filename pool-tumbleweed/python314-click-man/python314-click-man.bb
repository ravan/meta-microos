SUMMARY = "Automate generation of man pages for python click applications"
DESCRIPTION = "Automate generation of man pages for Python Click applications."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python314-click-man-0.5.1-1.5.noarch.rpm"
RPM_HASH = "95f51f9908f85312a55fd43331998f7fb83af0ce8ffd256a30b26440865af9f11f29a7aad0acdb1b6fa0545966bf04250cc122c09bc163028b2f41c79a20f32f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-man \
python314-click-man \
python3dist-click-man"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
update-alternatives"

inherit rpm
