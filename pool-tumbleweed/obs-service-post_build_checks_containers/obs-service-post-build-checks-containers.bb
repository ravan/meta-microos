SUMMARY = "Pulls in post-build-checks-containers BRP script"
DESCRIPTION = "An OBS service that pulls in the post-build-checks-containers package \
which uses brp scripts to scan containers."
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "obs-service-post_build_checks_containers-1.0-1.1.noarch.rpm"
RPM_HASH = "bb8da91386f06a6a5c37d036a42fdefaedf9c65060e07817263c75581e7da7bde15edf99b10936334c229a9a9e62654d1d39e3effa1aab16e201920a8154a4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-post-build-checks-containers"

RDEPENDS:${PN} += "/usr/bin/bash \
post-build-checks-containers"

inherit rpm
