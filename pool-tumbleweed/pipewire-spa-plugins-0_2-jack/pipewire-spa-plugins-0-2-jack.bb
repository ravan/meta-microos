SUMMARY = "SPA Plugin to use PipeWire as jack client"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Unlimited input/output ports; \
 * Per port format enumeration and negotiation; \
 * Enumeration/configuration of per port parameters; \
 * Application controlled buffer allocation with option to let the plugin \
   Allocate memory; \
 * Arbitrary buffer metadata; \
 * Buffers are passed around by id which is very fast and avoids the need \
   for refcounting; \
 * Synchronous and asynchronous processing; \
 * All api is designed to work without any allocations; \
 * Arbirary input/output behaviour. \
 \
This package provides the SPA plugin to connect Pipewire to a JACK server"
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-spa-plugins-0_2-jack-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "408f013980ed40ffacb56ea6dff981ed44a6a6611499dabd3456377e5bb8fd30a887e806c7909a4e57cccfcdae2c877c2866405992d0575a99ad3192c835f09c"

RPROVIDES:${PN} += "libpipewire-module-jack-tunnel.so \
libpipewire-module-jackdbus-detect.so \
libspa-jack.so \
pipewire-spa-plugins-0-2-jack"

RDEPENDS:${PN} += "jack \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libjack.so.0 \
libpipewire-0.3.so.0"

inherit rpm
