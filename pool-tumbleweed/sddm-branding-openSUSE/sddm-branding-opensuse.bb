SUMMARY = "openSUSE branding for SDDM (Qt5)"
DESCRIPTION = "This package provides the openSUSE branding for SDDM."
LICENSE = "GPL-2.0-or-later"

PV = "0.21.0+git57"

RPM_NAME = "sddm-branding-openSUSE-0.21.0+git57-1.1.noarch.rpm"
RPM_HASH = "36787382178b31fb595fafae825475b9d8e356d7f44af9af1953a666a5425998192de865b39bc7e55417d7c0f95bc3ffe339076daf62fe88a025e94ec45e3a46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sddm-branding \
sddm-branding-openSUSE"

RDEPENDS:${PN} += "kwin5 \
sddm \
sddm-theme-openSUSE"

inherit rpm
