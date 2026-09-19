SUMMARY = "Development files for the xBRZ library"
DESCRIPTION = "xBRZ is a bitmap upscaler employing pattern recognition and \
substituion rules. ('xBRZ' = Scale By Rules, Zenju enhanced variant.)"
LICENSE = "GPL-3.0-only"

PV = "1.8"

RPM_NAME = "xbrz-devel-1.8-2.13.aarch64.rpm"
RPM_HASH = "06df00f4d4eb8db1532fa62ab0d29c8231d86801fd25526a1efdbdacf74bb818e95768ba790d0527d4545fad66224f3b98b566198d62aea18019af8c73c60b89"

RPROVIDES:${PN} += "xbrz-devel"

RDEPENDS:${PN} += "libxbrz-1-8"

inherit rpm
