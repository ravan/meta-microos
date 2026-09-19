SUMMARY = "Headers for the intel-metee library"
DESCRIPTION = "Development package for the libmeete library."
LICENSE = "Apache-2.0"

PV = "6.0.2"

RPM_NAME = "intel-metee-devel-6.0.2-1.5.aarch64.rpm"
RPM_HASH = "1f02f509dc43559c0d227734c18b0bf1152f5297172a925fc811dae8f930876d37c11ed94a7e6c95332bd23d7e3abe7ce749c30049f5ca5e5aa8721b15afee64"

RPROVIDES:${PN} += "intel-metee-devel"

RDEPENDS:${PN} += "libmetee6-0-2-0"

inherit rpm
