SUMMARY = "The EGL External Platform interface"
DESCRIPTION = "This is a work-in-progress specification of the EGL External Platform interface \
for writing EGL platforms and their interactions with window systems on \
top of existing low-level EGL platform implementations. This keeps window system \
implementation specifics out of EGL drivers by using application-facing \
EGL functions."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "eglexternalplatform-devel-1.2.1-2.3.noarch.rpm"
RPM_HASH = "def4ebd1cf542beb995124b0fe4955f487aa714b3cb9549cf9fd48dcb2ba1c6af4f127e03f740b2440f7d8012566e33f080ff4084bab86992366f7d94f124470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eglexternalplatform-devel \
pkgconfig-eglexternalplatform"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
