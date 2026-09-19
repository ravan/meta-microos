SUMMARY = "Supply Chain Transparency Log"
DESCRIPTION = "Rekor's goals are to provide an immutable tamper resistant ledger of metadata \
generated within a software projects supply chain. Rekor will enable software \
maintainers and build systems to record signed metadata to an immutable record. \
Other parties can then query said metadata to enable them to make informed \
decisions on trust and non-repudiation of an object's lifecycle. For more \
details visit the sigstore website \
 \
The Rekor project provides a restful API based server for validation and a \
transparency log for storage. A CLI application is available to make and verify \
entries, query the transparency log for inclusion proof, integrity verification \
of the transparency log or retrieval of entries by either public key or \
artifact. \
 \
Rekor fulfils the signature transparency role of sigstore's software signing \
infrastructure. However, Rekor can be run on its own and is designed to be \
extensible to working with different manifest schemas and PKI tooling."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "rekor-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "948b454166fcb71685222d012a86d816f0b6c70a4117912c24a53475d525d8d8b488094bd537a71f4b709386768cd5fcd239d626dabe948225e2a3f93fbb306f"

RPROVIDES:${PN} += "rekor"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
