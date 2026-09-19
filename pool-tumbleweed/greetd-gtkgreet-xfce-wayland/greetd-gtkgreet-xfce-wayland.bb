SUMMARY = "Greetd config using gtkgreet and XFCE Wayland session"
DESCRIPTION = "This package configures greetd to use gtkgreet in the Cage Wayland compositor, \
and provides a session environment that launches XFCE in Wayland mode."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "greetd-gtkgreet-xfce-wayland-1.0-2.4.noarch.rpm"
RPM_HASH = "21833321b87f507a9d4847fcc5a3c58ef4aea260799a5fd960dc91cd49d6b2226a3ad2e70e6561b57e65fc22d18a390fd71cb20640276a06954a2fd8e3f0bc4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-greetd-gtkgreet-xfce-wayland \
greetd-branding \
greetd-gtkgreet-xfce-wayland"

RDEPENDS:${PN} += "cage \
greetd \
gtkgreet"

inherit rpm
