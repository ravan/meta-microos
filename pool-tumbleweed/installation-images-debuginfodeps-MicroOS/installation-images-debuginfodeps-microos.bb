SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.178-1.9.aarch64.rpm"
RPM_HASH = "8ed286ff346eeba7759fb7d625344ebed6aeed3fcfffda34f36f46e0399c7e6deae53f2fdcfee6a7a07ca43d849860289bd432fa2d0f40757be79eee3394a857"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
