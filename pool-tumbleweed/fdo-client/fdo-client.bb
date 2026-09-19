SUMMARY = "FIDO Device Onboard Client"
DESCRIPTION = "FDO-Client is a portable implementation of the FIDO Device Onboard Spec. \
This component is portable across multiple environments, \
including to various microprocessors (MPUs) and microcontrollers (MCUs)."
LICENSE = "Apache-2.0"

PV = "1.1.4+git20221209.c8ef757"

RPM_NAME = "fdo-client-1.1.4+git20221209.c8ef757-5.7.aarch64.rpm"
RPM_HASH = "b066ac28112c7ed7adc406d7b1038428ff63859a47546c822021f727515adab4d8133a9f8f2e5e16533748c02a1f85812043595fb0cba649afaf5481db413763"

RPROVIDES:${PN} += "fdo-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
openssl"

inherit rpm
