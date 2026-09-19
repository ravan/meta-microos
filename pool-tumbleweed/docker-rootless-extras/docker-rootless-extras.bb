SUMMARY = "Rootless support for Docker"
DESCRIPTION = "Rootless support for Docker. \
Use dockerd-rootless.sh to run the daemon. \
Use dockerd-rootless-setuptool.sh to setup systemd for dockerd-rootless.sh."
LICENSE = "Apache-2.0"

PV = "29.7.2_ce"

RPM_NAME = "docker-rootless-extras-29.7.2_ce-41.1.noarch.rpm"
RPM_HASH = "55d9f9e8ce7224e5d81aac3d7916cb84948eaef20acceb960dd35522d35f330cbf4b5d1f061f629c5c178dc910e7c14683b5912090bfdc467f848e16a1494bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-rootless-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
docker \
fuse-overlayfs \
rootlesskit \
slirp4netns"

inherit rpm
