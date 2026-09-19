SUMMARY = "Dynamic display configuration"
DESCRIPTION = "kanshi allows you to define output profiles that are automatically enabled \
and disabled on hotplug."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "kanshi-1.7.0-1.10.aarch64.rpm"
RPM_HASH = "48f70dcac69f9fc92e4755939f280ac171f56c21ab16ceef272466fe7c3366fca368d1f1b626715ff6c292c5161cde48d1a89fb0053489928c96c28ecfda7b63"

RPROVIDES:${PN} += "kanshi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libscfg.so.1 \
libvarlink.so.0 \
libwayland-client.so.0"

inherit rpm
