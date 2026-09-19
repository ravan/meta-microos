SUMMARY = "Confined login and user shell using podman"
DESCRIPTION = "podmansh provides a confined login and user shell with access to volumes and \
capabilities specified in user quadlets. \
 \
It is a symlink to /usr/bin/podman and execs into the `podmansh` container \
when `/usr/bin/podmansh` is set as a login shell or set as os.Args[0]."
LICENSE = "Apache-2.0"

PV = "6.0.2"

RPM_NAME = "podmansh-6.0.2-1.1.aarch64.rpm"
RPM_HASH = "8c6325f204d05e8d0281ee8dc381ee1a0181a97609c8b3c43185fe6703e902f10aa4ac9e44dffbb0c86a03c98ca556cf5831529a3e5dc1ecf623a7e7f166b7c1"

RPROVIDES:${PN} += "podman-podmansh \
podman-shell \
podmansh"

RDEPENDS:${PN} += "podman"

inherit rpm
