SUMMARY = "Shared data for the Core X11 protocol library"
DESCRIPTION = "Data files for X11: \
 \
* Error strings for X error codes \
* Device-independent color name database \
* Locale data and tables for the Compose Key"
LICENSE = "MIT"

PV = "1.8.13"

RPM_NAME = "libX11-data-1.8.13-1.4.noarch.rpm"
RPM_HASH = "d49aa9db0e27db64c6dca1400947a4f6b7cf74f86a892182b06c79ff5fe6fb4763f6e176522e498b0d8548c0db501c3618c89fe6fe2dcd169edeb8107e0d9c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libX11-data"

RDEPENDS:${PN} += ""

inherit rpm
