SUMMARY = "Rootless support for Docker"
DESCRIPTION = "Rootless support for Docker. \
Use dockerd-rootless.sh to run the daemon. \
Use dockerd-rootless-setuptool.sh to setup systemd for dockerd-rootless.sh."
LICENSE = "Apache-2.0"

PV = "24.0.9_ce"

RPM_NAME = "docker-stable-rootless-extras-24.0.9_ce-19.3.noarch.rpm"
RPM_HASH = "de3b403279f76bf5498bc2ec337d012e3ce3af320eac4bfebaa15578fa89d023daf9d106d9ad5a96a5685b486ad8ca3ced2659d2056961e187487c0f92466fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-rootless-extras \
docker-stable-rootless-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
docker-stable \
fuse-overlayfs \
rootlesskit \
slirp4netns"

inherit rpm
