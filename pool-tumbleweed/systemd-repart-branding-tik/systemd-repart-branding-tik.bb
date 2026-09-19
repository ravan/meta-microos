SUMMARY = "tik configuration for systemd-repart"
DESCRIPTION = "tik configuration for systemd-repart"
LICENSE = "MIT"

PV = "20240404"

RPM_NAME = "systemd-repart-branding-tik-20240404-1.7.noarch.rpm"
RPM_HASH = "68492b0fbbbc925dd6986cea0c0efc2dfe7ac1d6b0c1d01b11c7b43dd550e2e70189fbd9c39f042a2ff789a069fc3ff00405d533bf9eab5412dcd4e239a54db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-repart-branding \
systemd-repart-branding-tik"

RDEPENDS:${PN} += ""

inherit rpm
