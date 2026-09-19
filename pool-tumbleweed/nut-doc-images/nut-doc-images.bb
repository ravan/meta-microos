SUMMARY = "Network UPS Tools - Images for Documentation"
DESCRIPTION = "Images for the documentation. It is a supplementary package for some NUT \
documentation packages. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "nut-doc-images-2.8.5-2.2.noarch.rpm"
RPM_HASH = "75c74e6a981d3e38cbb78652dac7bc7355a0a23a8c04a0f08ef4e167940953ab4591776700d70c89a3b98bfc08aaf260169d78ec7589e360cda1c3b69395bea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-images"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
