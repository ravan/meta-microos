SUMMARY = "Vulkan layer to reduce the latency between inputs received and updates on the screen"
DESCRIPTION = "This package contains the VK_AMD_anti_lag Vulkan layer"
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-vulkan-anti-lag-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "b6750ccc2d13a6955f8b95284bb3117eb819430e8af875a0c5bf06f2730f7ce01822f41374a8772b84b38dbe05d1df28ca82771ab7394c44dbfd2598d4ebc070"

RPROVIDES:${PN} += "Mesa-vulkan-anti-lag \
libVkLayer-MESA-anti-lag.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
