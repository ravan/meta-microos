SUMMARY = "Development files for libdicom"
DESCRIPTION = "libdicom is a C library and a set of command-line tools for reading DICOM WSI files."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libdicom-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "71b71b24b65a3a0620288d6137cc4eb87a1b4bdf080341081a19aef4397ac841db6906e5b47666977bc0d73c7f1cdc09f95848f613c96b2633576c3efe0a7521"

RPROVIDES:${PN} += "libdicom-devel \
pkgconfig-libdicom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdicom1"

inherit rpm
