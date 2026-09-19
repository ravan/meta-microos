SUMMARY = "Mesa DRI plug-in for 3D acceleration via Nouveau"
DESCRIPTION = "This package contains nouveau_dri.so, which is necessary for \
Nouveau's 3D acceleration to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-dri-nouveau-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "3bbc8d47cd85ebe9575da014fe2f0ce456805e2416279a7e0e5e147c1b62279c135acbbee39d48b3efefd93f108f255ab8ee7709f4d00083b006e11c6076dd30"

RPROVIDES:${PN} += "Mesa-dri-nouveau"

RDEPENDS:${PN} += "Mesa"

inherit rpm
