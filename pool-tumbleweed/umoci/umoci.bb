SUMMARY = "Open Container Image manipulation tool"
DESCRIPTION = "umoci modifies Open Container images. umoci is a manipulation tool for OCI \
images. In particular, it is a more complete alternative to oci-image-tools \
provided by the OCI."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "umoci-0.6.0-1.8.aarch64.rpm"
RPM_HASH = "659963779ab7003da662f48d67103ac5919d626ffe53d62ddfdb22da1fb674347119bda3aaafdf9808ccc422e1c0f7fcc8bfb731449224cb2310fe65919ac383"

RPROVIDES:${PN} += "umoci"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
