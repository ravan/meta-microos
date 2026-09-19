SUMMARY = "Meta loader for the Vulkan API"
DESCRIPTION = "volk is a meta loader for Vulkan. It loads entrypoints required to \
use Vulkan by means of dlopen-ing libvulkan.so.1. volk simplifies the \
use of Vulkan extensions by loading all associated entrypoints. volk \
enables loading Vulkan entrypoints directly from the driver which can \
increase performance by skipping loader dispatch overhead."
LICENSE = "MIT"

PV = "1.4.341"

RPM_NAME = "libvolk-1_4_341-1.4.341-1.4.aarch64.rpm"
RPM_HASH = "397366b09c1b66a82c295ddcafc530f27dee518446103940725b0a41986eb75069ed06f78a1e8cf2aba9bcca09878c15cbbe2357959ff8f6de802c72fa373df3"

RPROVIDES:${PN} += "libvolk-1-4-341 \
libvolk-1.4.341.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
