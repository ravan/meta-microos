SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-15.671.aarch64.rpm"
RPM_HASH = "a403467299c04c5eb54eae110e9cfeebb5f09a342ce8ab345731e415689c5bf070238bcd0782c265e923694d0884c1a33f7e7eab477c7166afb3c577a30f88df"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
