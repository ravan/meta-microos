SUMMARY = "Ruby bindings for libvirt"
DESCRIPTION = "ruby-libvirt allows applications written in Ruby to use the \
libvirt API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "ruby4.0-rubygem-ruby-libvirt-0.8.4-1.9.aarch64.rpm"
RPM_HASH = "786c24db11aff41ba7aef2642fb7d94f5c19ab25ebeeee82db225c3a26d2a718d9bf0ee83811033820c3d58758b8abf7c12f2743ff63e2018efd0ed5147ce78e"

RPROVIDES:${PN} += "ruby4.0-rubygem-ruby-libvirt \
rubygem-ruby-4.0.0-ruby-libvirt \
rubygem-ruby-4.0.0-ruby-libvirt-0 \
rubygem-ruby-4.0.0-ruby-libvirt-0.8 \
rubygem-ruby-4.0.0-ruby-libvirt-0.8.4 \
rubygem-ruby-libvirt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
