SUMMARY = "TCTI cmd interface library"
DESCRIPTION = "A TCTI for interaction with a subprocess. It abstracts the details of direct \
communication with the interface and protocol exposed by a subprocess that can \
receive and transmit raw TPM2 command and response buffers."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tcti-cmd0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "a94c067af2473bec02a1beed457a7d295eba19ae71ab00e4fc58d70263b16d557f5a64b55dd25cb587efdccbe217447ae86b74860fd5a0c61ee2383466ba3c18"

RPROVIDES:${PN} += "libtss2-tcti-cmd.so.0 \
libtss2-tcti-cmd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
