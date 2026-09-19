SUMMARY = "Utilities to check proper 3d support before launching 3d games"
DESCRIPTION = "This package contains various shell scripts which are intended for use by \
3D games packages. These shell scripts can be used to check if direct rendering \
is available before launching an OpenGL game. This package is intended for use \
by other packages and is not intended for direct end user use!"
LICENSE = "SUSE-Public-Domain"

PV = "0.2"

RPM_NAME = "opengl-games-utils-0.2-3.7.noarch.rpm"
RPM_HASH = "416804a6590d9ea6e8243bd91892df3e72d9244af41122c5cda81991d11d31030e6505910ee974b49fdbc6dcd12b843ed2f7f9d7e464f450dc3939964b6c49ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opengl-games-utils"

RDEPENDS:${PN} += "/usr/bin/glxinfo \
/usr/bin/sh \
zenity"

inherit rpm
