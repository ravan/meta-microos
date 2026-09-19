SUMMARY = "Documentation for the LAME MP3 encoder"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-doc-3.100-5.15.aarch64.rpm"
RPM_HASH = "4ce12aff22bccfe6b0bc5d61e4329e9e56e0aedbd9a0bee7d5f4d7922b94c8b980f3c43031dce9db6d403cc60d75dcf7576ffa8e976d98298acb6959393665e6"

RPROVIDES:${PN} += "lame-doc"

RDEPENDS:${PN} += "lame"

inherit rpm
