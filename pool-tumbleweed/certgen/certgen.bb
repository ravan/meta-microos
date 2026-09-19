SUMMARY = "A dead simple tool to generate self signed certificates"
DESCRIPTION = "certgen is a simple tool to generate self-signed certificates, and provides SAN \
certificates with DNS and IP entries."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "certgen-1.4.0-1.8.aarch64.rpm"
RPM_HASH = "e88feadabe4be4ceb2417a9605a3ff688b6f5fc99880c42fa60b7141482ada6fa6ad5ebf43dec73a8da6b9dd0cb247bec2a60afd9d00904e19dd3469f8ef57ae"

RPROVIDES:${PN} += "certgen"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
