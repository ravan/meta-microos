SUMMARY = "An OBS source service: Wrapper for download_assets"
DESCRIPTION = "A small wrapper to make download_assets from the build script usable \
via a source service."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "obs-service-download_assets-0.2-2.7.noarch.rpm"
RPM_HASH = "1d2bfb1fea3818826db3c7c7772cd97c53b5c297609387411142486c99fc82ed645d0db63a67112bbef872efaf6095b34f00d9400a1ca166995be52908d2c053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-obs-service-download-assets \
obs-service-download-assets"

RDEPENDS:${PN} += "/usr/bin/env \
build \
perl-LWP--UserAgent"

inherit rpm
