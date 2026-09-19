SUMMARY = "openSUSE Branding of libxfce4ui"
DESCRIPTION = "This package provides the openSUSE look and feel for the libxfce4ui library."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "libxfce4ui-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "0dff80355fe51640601588bd7e199f323fafe581da99aac0f0107caf06f5bf16ebf7ac154d2727b613738cf24220b058c374d5b8604a7f09d2264a5c152228e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libxfce4ui-branding-openSUSE \
libxfce4ui-branding \
libxfce4ui-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
