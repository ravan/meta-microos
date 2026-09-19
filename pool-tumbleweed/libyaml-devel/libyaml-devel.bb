SUMMARY = "Development files for libyaml"
DESCRIPTION = "This package holds the development files for libyaml, \
a YAML parser and emitter written in C."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libyaml-devel-0.2.5-2.14.aarch64.rpm"
RPM_HASH = "bceab5fc9e9b8ed4db0f8c30123a58e05a45df892e6c8b9a21e3a3791cf4fcdaff61e7c8f364cc10be1afe5aeb557db5c156aa528fbb7687b8a8344e3e4bcb05"

RPROVIDES:${PN} += "libyaml-devel \
pkgconfig-yaml-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyaml-0-2"

inherit rpm
