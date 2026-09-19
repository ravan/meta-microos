SUMMARY = "Development files for the SoapyOsmoSDR library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libSoapyOsmoSDR."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.5"

RPM_NAME = "soapy-osmo-devel-0.2.5-13.1.aarch64.rpm"
RPM_HASH = "3180d81fae9d42c188ec9e713351c1d35ce3157e9b5e8fbc09f70f05333e2f41382276e7450e12bf13f5d2ae754d65cb69433cb05194e083723050fca472333a"

RPROVIDES:${PN} += "soapy-osmo-devel"

RDEPENDS:${PN} += "libSoapyOsmoSDR0"

inherit rpm
