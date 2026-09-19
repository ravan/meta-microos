SUMMARY = "Doc Package for Dumb"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library. \
 \
This package contains the docs for dumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-devel-doc-2.0.3-1.19.aarch64.rpm"
RPM_HASH = "48766a65c8936c4ea81493f538b0c6755e97736c744e82ede0520879830728e6bdadbae769f250fa7e265d5d74af4b4db310a9c7312def766fa7d8798f969d82"

RPROVIDES:${PN} += "dumb-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
