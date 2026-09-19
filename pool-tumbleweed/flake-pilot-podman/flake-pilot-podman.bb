SUMMARY = "Podman pilot"
DESCRIPTION = "Launcher for OCI containers based applications through podman"
LICENSE = "MIT"

PV = "3.1.45"

RPM_NAME = "flake-pilot-podman-3.1.45-1.2.aarch64.rpm"
RPM_HASH = "a2bfba0e3c2e6fea09f60a282efebba2f88b6798d1045a577ec04cfa90b680913b86071e916885d4b2b114595c4cdb4847a2c6e8d5966ce04f3aeac4cf01169e"

RPROVIDES:${PN} += "config-flake-pilot-podman \
flake-pilot-podman"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libgcc-s.so.1 \
podman \
rsync \
sudo"

inherit rpm
