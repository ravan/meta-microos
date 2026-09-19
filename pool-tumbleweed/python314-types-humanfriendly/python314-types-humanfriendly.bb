SUMMARY = "Typing stubs for humanfriendly"
DESCRIPTION = "Collection of library stubs for Python, with static types."
LICENSE = "Apache-2.0"

PV = "10.0.1.20241105"

RPM_NAME = "python314-types-humanfriendly-10.0.1.20241105-1.8.noarch.rpm"
RPM_HASH = "b6bac9f83f623943123b11e6fc1ed74bf20430d023dc63f3ff63577c101501e0ce5f0ce29c8e2fb70962a48208482407ac4ffa47eb08b19247a1ffcc619c4ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-types-humanfriendly \
python314-types-humanfriendly \
python3dist-types-humanfriendly"

RDEPENDS:${PN} += ""

inherit rpm
