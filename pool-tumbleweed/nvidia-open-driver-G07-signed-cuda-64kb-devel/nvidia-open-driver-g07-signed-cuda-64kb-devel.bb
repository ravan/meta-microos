SUMMARY = "Devel Package to nvidia-open-driver-G07-signed-cuda"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G07-signed-cuda"
LICENSE = "GPL-2.0-only & MIT"

PV = "615.71.09"

RPM_NAME = "nvidia-open-driver-G07-signed-cuda-64kb-devel-615.71.09-2.2.aarch64.rpm"
RPM_HASH = "646df531bb42d930339ca01d4fb985680599fff944b6d75399d22696ddd9eae8268625cc8b0ffe77c47a6342ae3de2207525d433025afb61dc57fad7854fc07f"

RPROVIDES:${PN} += "nvidia-open-driver-G07-signed-64kb-devel-cuda \
nvidia-open-driver-G07-signed-cuda-64kb-devel"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
