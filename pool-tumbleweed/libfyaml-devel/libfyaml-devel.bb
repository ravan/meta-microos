SUMMARY = "Development files for libfyaml"
DESCRIPTION = "This package holds the development files for libfyaml, \
a YAML parser and emitter written in C."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "libfyaml-devel-0.9.5-1.3.aarch64.rpm"
RPM_HASH = "1abb9e43de8b59b55ca8de097f871fb27e6420f051f3725284fdbef924dab4e18af487063fa6b9440ae9cb4b62154d4b1dd24c8dccb4b4ff109cdf49cdea0a30"

RPROVIDES:${PN} += "libfyaml-devel \
pkgconfig-libfyaml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfyaml0"

inherit rpm
