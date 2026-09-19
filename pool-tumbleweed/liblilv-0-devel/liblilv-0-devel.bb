SUMMARY = "Development files for liblilv"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications. \
This subpackage contains the development files for liblilv."
LICENSE = "ISC"

PV = "0.28.0"

RPM_NAME = "liblilv-0-devel-0.28.0-1.3.aarch64.rpm"
RPM_HASH = "920d4b0af7652bb79a6b7187fe0e92932beb6edf0db5c644038725d1efadb7183861863cff4cab14b63ee04a23cf28061548a27bc5f9d70f00432978f4965a10"

RPROVIDES:${PN} += "liblilv-0-devel \
pkgconfig-lilv-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblilv-0-0 \
pkgconfig-lv2 \
pkgconfig-serd-0 \
pkgconfig-sord-0 \
pkgconfig-sratom-0 \
pkgconfig-zix-0"

inherit rpm
