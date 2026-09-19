SUMMARY = "Abseil library liblibabsl_poison"
DESCRIPTION = "This package contains the libabsl_poison library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_poison2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "82dc43635162d96be0c811a22a272c879d96639d368b1909e3c9e0347245dfa1fa45d8ef19d45795ef200b1fbfc27987018adfbeb663411acc841ddfe3cbb8da"

RPROVIDES:${PN} += "libabsl-poison.so.2608.0.0 \
libabsl-poison2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
