SUMMARY = "VirtX is a simple federation of KVM hosts based on libvirt and serf"
DESCRIPTION = "A tool for managing a simple federation of KVM hosts based on libvirt and \
serf leveraging shared storage, and offering a REST API, to make it easier \
to implement custom KVM platforms."
LICENSE = "GPL-2.0-only"

PV = "0.1+gf3a7fda"

RPM_NAME = "virtx-0.1+gf3a7fda-1.1.aarch64.rpm"
RPM_HASH = "7a75e9f6750d43e3e46fcb2533c58597f3f82ecf51e64c494c211b74972a8e09036c81579094ebc9bd0479cfb3a25bd2f175bd2dfe7b23d83969030fcd39dc60"

RPROVIDES:${PN} += "virtx"

RDEPENDS:${PN} += "/usr/bin/sh \
hashicorp-serf \
libc.so.6 \
libvirt-daemon-config-network \
libvirt-daemon-plugin-sanlock \
libvirt-daemon-proxy \
libvirt-daemon-qemu \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
numa-preplace \
qemu-hw-display-virtio-gpu-pci \
qemu-pr-helper \
sanlock"

inherit rpm
