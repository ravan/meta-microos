SUMMARY = "KIWI - host requirements for WSL container images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build WSL container images"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-containers-wsl-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "42d6363a0357284155dd4046457d1523b9c672bbaf7ed4b611fb40144cf96d17e28a2fedebe249792f37f4a1c06451c36aa126cc785985f826eba5e18aa48979"

RPROVIDES:${PN} += "kiwi-image-appx \
kiwi-image-wsl \
kiwi-image-wsl-requires \
kiwi-systemdeps-containers-wsl"

RDEPENDS:${PN} += "fb-util-for-appx"

inherit rpm
