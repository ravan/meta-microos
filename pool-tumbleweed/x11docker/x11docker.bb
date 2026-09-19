SUMMARY = "Tool for running GUI applications in containers"
DESCRIPTION = "x11docker runs graphical desktop applications and entire desktop \
environments in Linux containers. It can use Docker, Podman, or nerdctl \
as container backend and starts separate X or Wayland display servers \
to reduce common X11 security risks."
LICENSE = "MIT"

PV = "7.8.0"

RPM_NAME = "x11docker-7.8.0-1.1.noarch.rpm"
RPM_HASH = "a366d423f104575da7e284f5eaa97adc7dd9d47f2f8b3906e14bbe46ead4fbb92693f9906f706fcf8d2e25d2a88e1511e137efc65c5658e614ba6085bc5653b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "x11docker"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
