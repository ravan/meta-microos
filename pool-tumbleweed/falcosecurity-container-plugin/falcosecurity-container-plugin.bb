SUMMARY = "Falcosecurity plugin providing container metadata"
DESCRIPTION = "The container plugin enriches Falco/libsinsp events with container metadata \
(id, name, image, labels, ...) gathered from the local container runtimes \
(Docker, containerd, CRI-O, Podman). It is loaded as a shared-object plugin \
(libcontainer.so) by the falcosecurity libs (the system libsinsp) and by \
sysdig; the plugin itself links only the header-only plugin SDK, not libsinsp."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "0.7.4"

RPM_NAME = "falcosecurity-container-plugin-0.7.4-1.1.aarch64.rpm"
RPM_HASH = "881cf362581df79bb0fa283fe772e485c60e4b30668c6cb81878eae4a532aeb1f7d8ff552bfa8355f8f0d22a0a9180ee89f6f5c7bc716284a7b0f065fec511da"

RPROVIDES:${PN} += "falcosecurity-container-plugin \
libcontainer.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreflex.so.6.4"

inherit rpm
