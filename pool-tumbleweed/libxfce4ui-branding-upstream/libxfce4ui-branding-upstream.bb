SUMMARY = "Upstream Branding of libxfce4ui"
DESCRIPTION = "This package provides the upstream look and feel for libxfce4ui."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "libxfce4ui-branding-upstream-4.20.2-1.5.noarch.rpm"
RPM_HASH = "561cf82c9b396727935b4d872039b16f28de543aba594145aa677677f79d200a6f87eda186d27893baf8e2c154f838463dd206030c7e160283e570545d5718c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libxfce4ui-branding-upstream \
libxfce4ui-branding \
libxfce4ui-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
