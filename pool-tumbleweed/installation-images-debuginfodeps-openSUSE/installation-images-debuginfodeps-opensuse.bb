SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.178-1.9.aarch64.rpm"
RPM_HASH = "f7ccc281c0acf86796be913e722818ab0a494ff3eb88454da1f9749ece21df3ed1aaaf680295201c12c10d29e8285593a809d80986d48b53ee5802b455e5c684"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
