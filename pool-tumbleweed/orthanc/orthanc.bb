SUMMARY = "RESTful DICOM server for healthcare and medical research"
DESCRIPTION = "Orthanc aims at providing a simple, yet powerful standalone DICOM server. \
Orthanc can turn any computer running Windows or Linux into a DICOM store \
(in other words, a mini-PACS system). Its architecture is lightweight, \
meaning that no complex database administration is required, nor the \
installation of third-party dependencies. What makes Orthanc unique \
is the fact that it provides a RESTful API. Thanks to this major \
feature, it is possible to drive Orthanc from any computer language. \
 \
The DICOM tags of the stored medical images can be downloaded in the \
JSON file format. Furthermore, standard PNG images can be generated \
on-the-fly from the DICOM instances by Orthanc. Orthanc lets its \
users focus on the content of the DICOM files, hiding the complexity \
of the DICOM format and of the DICOM protocol."
LICENSE = "GPL-3.0-or-later"

PV = "1.13.0"

RPM_NAME = "orthanc-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "55cefeb98deacccfb1dfc20cab8bc53d2fa87f2ac58daf2798c39df06361ae6e99d3d1c22bd7d554e2e3978711c0bc98fb75945ff0732eb3d49d60f9a7016e3a"

RPROVIDES:${PN} += "config-orthanc \
group-orthanc \
libConnectivityChecks.so.1.13.0 \
libDelayedDeletion.so.1.13.0 \
libHousekeeper.so.1.13.0 \
libModalityWorklists.so.1.13.0 \
libMultitenantDicom.so.1.13.0 \
libServeFolders.so.1.13.0 \
orthanc \
user-orthanc"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
dcmtk \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcivetweb.so.1.16.0 \
libcrypto.so.3 \
libcurl.so.4 \
libdcmdata.so.20 \
libdcmimage.so.20 \
libdcmjpeg.so.20 \
libdcmjpls.so.20 \
libdcmnet.so.20 \
libdcmtls.so.20 \
libgcc-s.so.1 \
libjpeg.so.8 \
libjsoncpp.so.27 \
liblua5.4.so.5 \
liboflog.so.20 \
libofstd.so.20 \
libpng16.so.16 \
libprotobuf.so.36.1.0 \
libpugixml.so.1 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
