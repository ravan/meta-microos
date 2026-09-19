SUMMARY = "OpenCASCADE application framework libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE application framework module: \
  TKCDF TKLCAF TKCAF TKBinL TKXmlL TKBin TKXml TKStdL \
  TKStd TKTObj TKBinTObj TKXmlTObj"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "libopencascade-applicationframework7_9_3-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "cd44c554de9d2156bc92bd88c10e3955ae8a815f53e092339e0e2814eecbaaefdbdae7c10736d836c436c42577537c92db83f63c7fe783304410d5b33d1828ab"

RPROVIDES:${PN} += "libTKBin.so.7.9.3 \
libTKBinL.so.7.9.3 \
libTKBinTObj.so.7.9.3 \
libTKCAF.so.7.9.3 \
libTKCDF.so.7.9.3 \
libTKLCAF.so.7.9.3 \
libTKStd.so.7.9.3 \
libTKStdL.so.7.9.3 \
libTKTObj.so.7.9.3 \
libTKVCAF.so.7.9.3 \
libTKXml.so.7.9.3 \
libTKXmlL.so.7.9.3 \
libTKXmlTObj.so.7.9.3 \
libopencascade-applicationframework7-9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKBO.so.7.9.3 \
libTKBRep.so.7.9.3 \
libTKG2d.so.7.9.3 \
libTKG3d.so.7.9.3 \
libTKGeomBase.so.7.9.3 \
libTKMath.so.7.9.3 \
libTKService.so.7.9.3 \
libTKTopAlgo.so.7.9.3 \
libTKV3d.so.7.9.3 \
libTKernel.so.7.9.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
