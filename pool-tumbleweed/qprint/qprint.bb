SUMMARY = "Command line utility which encodes and decodes files in this format"
DESCRIPTION = "qprint is a command line utility which encodes and decodes files in this format. It can be used within a pipeline as an encoding or decoding filter, and is most commonly used in this manner as part of an automated mail processing system. With appropriate options, qprint can encode pure binary files, but it's a poor choice since it may inflate the size of the file by as much as a factor of three. The base64 MIME encoding is a better choice for such data."
LICENSE = "SUSE-Public-Domain"

PV = "1.1"

RPM_NAME = "qprint-1.1-1.35.aarch64.rpm"
RPM_HASH = "d304aad51ce59db7eba298101606ee934abed93ec3c5e67d942af0e9631ab99b17ac58b987118b6b98dbd10edc1db85473bb035deb3fc19455a6220c740962db"

RPROVIDES:${PN} += "qprint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
