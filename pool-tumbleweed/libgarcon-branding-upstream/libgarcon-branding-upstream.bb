SUMMARY = "Upstream Branding of garcon"
DESCRIPTION = "This package provides the upstream look and feel for garcon."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.20.0"

RPM_NAME = "libgarcon-branding-upstream-4.20.0-1.8.noarch.rpm"
RPM_HASH = "55e8189ddedf88b736b6949cb63978279ccd75f1944fea3b665f7d1663c08eb0c9115d1b298f842d7f595ce476e75ac6ffe4147fc78091b9caa6b4a706628a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libgarcon-branding-upstream \
libgarcon-branding \
libgarcon-branding-upstream"

RDEPENDS:${PN} += "libxfce4ui-tools"

inherit rpm
