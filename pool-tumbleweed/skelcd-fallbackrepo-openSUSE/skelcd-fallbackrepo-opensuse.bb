SUMMARY = "Packages for openSUSE to include in fallback repository"
DESCRIPTION = "Packages to include in fallback repository for openSUSE. The fallback repository is \
part of the installation system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "skelcd-fallbackrepo-openSUSE-1.1-4.70.aarch64.rpm"
RPM_HASH = "456ac28aa096e4193a4f8bbde4c35b63763ee752957858609275e608721be3eab79f1878cd2c4db3dc8a554269d1f8b2db75538cec4c47ef62d6678ab6131684"

RPROVIDES:${PN} += "skelcd-fallbackrepo \
skelcd-fallbackrepo-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
