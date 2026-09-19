SUMMARY = "Lightweight C library for loading and wrapping LV2 plugin UIs"
DESCRIPTION = " \
Suil is a lightweight C library for loading and wrapping LV2 plugin UIs. \
 \
Suil makes it possible to load a UI of any toolkit in a host using any \
other toolkit (assuming the toolkits are both supported by Suil). \
Hosts do not need to build against or link to foreign toolkit libraries \
to use UIs written with that toolkit (Suil performs its magic at \
runtime using dynamically loaded modules). The API is designed such that \
hosts do not need to explicitly support particular toolkits whatsoever. \
If Suil supports a particular toolkit, then all hosts that use Suil will \
support that toolkit."
LICENSE = "ISC"

PV = "0.10.22"

RPM_NAME = "libsuil-0-0-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "c082724fcde4d5e89b2cbb50afa037af9fb72722c35ba4bb51bbfcdd9cffb641be26f21341a1727344f08258059595aa9fdf80eba9e19b4be2931f9434af4c8f"

RPROVIDES:${PN} += "libsuil-0-0 \
libsuil-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
