SUMMARY = "Upstream Branding of xfce4-session"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Session Manager."
LICENSE = "GPL-2.0-only"

PV = "4.20.4"

RPM_NAME = "xfce4-session-branding-upstream-4.20.4-1.3.noarch.rpm"
RPM_HASH = "1689241aa7eff379ee653a9c2e1fa2bd9f207f7a2e2cc76869a227ce37b032478fe3b719157e9b7140be48afab59aa025b8812d54f3891fa358ca24c4ce01bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-session-branding-upstream \
xfce4-session-branding \
xfce4-session-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
