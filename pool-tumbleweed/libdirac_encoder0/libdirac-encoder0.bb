SUMMARY = "Dirac Video Codec Encoder Library"
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

RPM_NAME = "libdirac_encoder0-1.0.2-34.10.aarch64.rpm"
RPM_HASH = "4b054b119b0cdb83dc42b3765274d39302ef76a87768f65c879e156b83c54f72e077f5116c7e98f5266a9fdacda932aea63456bb2a74fa065a7230e6289940d3"

RPROVIDES:${PN} += "libdirac-encoder.so.0 \
libdirac-encoder0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
