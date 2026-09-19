SUMMARY = "SFML developer documentation"
DESCRIPTION = "SFML is a multimedia API that provides access to graphics, input, \
audio, etc. similar to SDL. \
 \
This subpackage contains the developer documentation."
LICENSE = "Zlib"

PV = "2.6.1"

RPM_NAME = "sfml2-doc-2.6.1-2.8.noarch.rpm"
RPM_HASH = "25703b475f2f0cae8afad9a64cbaea487427ab11f6d27db380a83f633ed9672197e66ae592ca5aca7216b92f9915a17de947169d1de2944c9f45f215cba0d2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sfml2-doc"

RDEPENDS:${PN} += ""

inherit rpm
