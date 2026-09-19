SUMMARY = "Module for the 'fog' gem to support libvirt"
DESCRIPTION = "This library can be used as a module for 'fog' or as standalone libvirt \
provider."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "ruby4.0-rubygem-fog-libvirt-0.12.2-1.10.aarch64.rpm"
RPM_HASH = "94c2a35b45618d8d0256cbc3d451a2ce1feadd34301e1f4f9c054cbcaaaa02c58f5ce673b57703ae3b46bfc7f9dd7c27fbbaf3158cf3014d47963ffd7c210c11"

RPROVIDES:${PN} += "ruby4.0-rubygem-fog-libvirt \
rubygem-fog-libvirt \
rubygem-ruby-4.0.0-fog-libvirt \
rubygem-ruby-4.0.0-fog-libvirt-0 \
rubygem-ruby-4.0.0-fog-libvirt-0.12 \
rubygem-ruby-4.0.0-fog-libvirt-0.12.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-fog-core \
rubygem-ruby-4.0.0-fog-json \
rubygem-ruby-4.0.0-fog-xml-0.1 \
rubygem-ruby-4.0.0-json \
rubygem-ruby-4.0.0-ruby-libvirt"

inherit rpm
