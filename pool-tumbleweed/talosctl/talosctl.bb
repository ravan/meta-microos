SUMMARY = "CLI to interact with Talos Linux"
DESCRIPTION = "Talos Linux is a modern Linux distribution built for Kubernetes. \
The talosctl tool acts as a reference implementation for the Talos API, but it \
also handles a lot of conveniences for the use of Talos and its clusters."
LICENSE = "MPL-2.0"

PV = "1.13.9"

RPM_NAME = "talosctl-1.13.9-1.1.aarch64.rpm"
RPM_HASH = "67efdb3b4d3ed753f06df00d5da33d9f34ca6f9a295516c0ff82f75c6a7235f00047cc6332f059e56c76da7121185b5c1af2135cc772e802c1aac4f46a6750a5"

RPROVIDES:${PN} += "talosctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
