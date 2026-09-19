SUMMARY = "Development files for the SoapySDR library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libSoapySDR."
LICENSE = "BSL-1.0"

PV = "0.8.1+git20250223.6e99da1"

RPM_NAME = "soapy-sdr-devel-0.8.1+git20250223.6e99da1-2.6.aarch64.rpm"
RPM_HASH = "3b76a7b222fa93f3c8ba44625fa1323bb5efb5d8a1b9369688221d5dae1f9dc355c5c88edb1b4edbbf877824b645242a0aaab0f1f0f760a1f4d5e19ba3e99da2"

RPROVIDES:${PN} += "cmake-SoapySDR \
pkgconfig-SoapySDR \
soapy-sdr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSoapySDR0-8-3"

inherit rpm
