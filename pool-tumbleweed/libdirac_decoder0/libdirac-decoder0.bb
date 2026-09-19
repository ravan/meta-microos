SUMMARY = "Dirac Video Codec Decoder Library"
DESCRIPTION = "Dirac is an open source video codec. It uses a traditional hybrid video \
codec architecture, but with the wavelet transform instead of the usual \
block transforms.  Motion compensation uses overlapped blocks to reduce \
block artefacts that would upset the transform coding stage. \
 \
Dirac can code just about any size of video, from streaming up to HD \
and beyond, although certain presets are defined for different \
applications and standards.  These cover the parameters that need to be \
set for the encoder to work, such as block sizes and temporal \
prediction structures, which must otherwise be set by hand."
LICENSE = "MPL-1.1"

PV = "1.0.2"

RPM_NAME = "libdirac_decoder0-1.0.2-34.10.aarch64.rpm"
RPM_HASH = "6837eeaae049d6986486a9e08f9605fbc0d29800774cfdfeeda809cc8d8711c66ce5e4cd0f256a37222af10fcf583fdc4ecda9c263f08622f98ca1a6e85fe478"

RPROVIDES:${PN} += "libdirac-decoder.so.0 \
libdirac-decoder0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
