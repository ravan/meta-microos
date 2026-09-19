SUMMARY = "Colour Management Libraries"
DESCRIPTION = "IccLibXML library acts as an extension of SampleICC's IccProfLib. \
This extension provides inherited classes for the classes in IccProfLib \
that provide additional I/O routines to read and write the classes as \
XML files"
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "libIccXML2-0.9.8-2.38.aarch64.rpm"
RPM_HASH = "95a97ac9475d201dd814bee2e56ce16b72106f6db89b02f662d4200679551eccded5e6b24bf8925260b047f1696553efedf98ace2aab9ff7b69694bc979fed74"

RPROVIDES:${PN} += "libIccXML.so.2 \
libIccXML2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSampleICC.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
