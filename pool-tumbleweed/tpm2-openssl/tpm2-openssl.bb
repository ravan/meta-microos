SUMMARY = "OpenSSL 3 Engine for TPM2 devices"
DESCRIPTION = "Makes the TPM 2.0 accessible via the standard OpenSSL API and command-line tools, so \
one can add TPM support to (almost) any OpenSSL 3.x based application."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "tpm2-openssl-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "c925ed5079f3e677b3dd93cf752ed5136d49c9606baed994ed81edb46aa82d02fa850b15234dc454cc0419337bd30327e1285205d752e045ce23aa54bd76a2b5"

RPROVIDES:${PN} += "tpm2-openssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtss2-esys.so.0 \
libtss2-rc.so.0 \
libtss2-tctildr.so.0"

inherit rpm
