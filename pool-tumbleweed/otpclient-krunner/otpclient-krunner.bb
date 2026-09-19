SUMMARY = "KRunner plugin for otpclient"
DESCRIPTION = "KRunner integration for otpclient, allowing OTP codes to be looked up \
directly from KRunner."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.8"

RPM_NAME = "otpclient-krunner-5.1.8-1.1.noarch.rpm"
RPM_HASH = "cfb1c7a8f92fb1f5fb8199f49f5061264e3a33aa568f4c2d2719926206c05454ff74052ae2238e7099072203e4a3113f21f6a23e5a5acd1be97c965571dc031e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "otpclient-krunner"

RDEPENDS:${PN} += "kf6-krunner \
otpclient"

inherit rpm
