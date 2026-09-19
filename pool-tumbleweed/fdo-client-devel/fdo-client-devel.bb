SUMMARY = "FIDO Device Onboard Client SDK"
DESCRIPTION = "This is a production-ready implementation of the Device component defined \
in FIDO Device Onboard Spec published by the FIDO Alliance. \
Appropriate security measures should be taken for storing the device \
credentials while porting this to different platforms."
LICENSE = "Apache-2.0"

PV = "1.1.4+git20221209.c8ef757"

RPM_NAME = "fdo-client-devel-1.1.4+git20221209.c8ef757-5.7.aarch64.rpm"
RPM_HASH = "4eebf709aff1f3d0d3a2c2b5ca922c106006cead8b101eaa0c7959036a914b4c73cf17d4185b54d043752422066204178a6199638222586e320a69a4dbb4b8a0"

RPROVIDES:${PN} += "fdo-client-devel"

RDEPENDS:${PN} += "libopenssl-devel"

inherit rpm
