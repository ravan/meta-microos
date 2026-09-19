SUMMARY = "Default set of cursor themes for X"
DESCRIPTION = "This is a default set of cursor themes for use with libXcursor, \
originally created for the XFree86 Project, and now shipped as part \
of the X.Org software distribution."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "xcursor-themes-1.0.7-1.10.noarch.rpm"
RPM_HASH = "23bf40c1a997a33e485ca235e632a9fd5b8de4e93f5e2a99fd1198f3d618d97df432642ad66f0b9307614c67d49b159ce99134c3e25e7d4b47ce10507db4185e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xcursor-themes"

RDEPENDS:${PN} += ""

inherit rpm
