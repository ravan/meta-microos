SUMMARY = "openSUSE Branding of xfce4-notifyd"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Notification Daemon."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "xfce4-notifyd-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "d0a876e004f78b9b9288210ac25dcae949466b76fc87b70fc23385b7d6a3271ae32ee8f606121d0d9ca326b99faef2548373f995c76488139f52355c10225b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-notifyd-branding-openSUSE \
xfce4-notifyd-branding \
xfce4-notifyd-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
