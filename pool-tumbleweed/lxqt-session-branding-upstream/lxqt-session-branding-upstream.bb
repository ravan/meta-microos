SUMMARY = "Upstream branding of lxqt-session"
DESCRIPTION = "This package provides the upstream look and feel for lxqt-session."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-session-branding-upstream-2.4.0-1.2.noarch.rpm"
RPM_HASH = "b52c258b18229a79cbb2169f8bd720b73e92830c7da01d648b54d82234e43b805a5081f76d6506bcfa6e174e170421b4b68486b8cf6b67cebc8271b7c32e4fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxqt-session-branding-upstream \
lxqt-session-branding \
lxqt-session-branding-upstream"

RDEPENDS:${PN} += "lxqt-session"

inherit rpm
