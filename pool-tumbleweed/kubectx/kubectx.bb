SUMMARY = "Faster way to switch between clusters and namespaces in kubectl"
DESCRIPTION = "kubectx is a utility to manage and switch between kubectl(1) contexts."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "kubectx-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "322f67bf9bd49399e747476c0500bda5b22a91355c51b1ae8d69aec7b5dffa8c539a7844c9bf279afe05ded9f2adbe9ed0525dd11aabaf2d0c968fde29ac4593"

RPROVIDES:${PN} += "kubectx"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
