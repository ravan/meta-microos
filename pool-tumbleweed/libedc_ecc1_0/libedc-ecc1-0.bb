SUMMARY = "Reed-Solomon encoder for Compact Discs"
DESCRIPTION = "The library implements a Reed-Solomon encoder for Compact \
Discs to generate Error Correcting Codes (ECC)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libedc_ecc1_0-3.02~a10-53.5.aarch64.rpm"
RPM_HASH = "a00b6bcb5104dff2d936810d3c38fa032543740b995a8ed8264b4b3616927f5ee6df3a68cd3263a7f7f3592faab8ef966526fbf09aa91013c69d3e8af147c1b0"

RPROVIDES:${PN} += "libedc-ecc.so.1.0 \
libedc-ecc1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
