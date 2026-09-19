SUMMARY = "Local Extensions for Apache Maven"
DESCRIPTION = "This package provides extensions for Apache Maven that can be used to \
manage system artifact repository and use it to resolve Maven \
artifacts in offline mode, as well as Maven plugins to help with \
creating RPM packages containing Maven artifacts."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-4.3.0-8.1.aarch64.rpm"
RPM_HASH = "39f7699b42b75e8afa4a1fe597b17fc3bcff6540aaed5240da7657076381b5324f74dede56681349f9cfdbf994f4b27d7b30a3da547b91fd0609e28eca8b39c6"

RPROVIDES:${PN} += "xmvn"

RDEPENDS:${PN} += "xmvn-minimal"

inherit rpm
