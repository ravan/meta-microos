SUMMARY = "Data files for csound"
DESCRIPTION = "HRTF datafiles and Soundfont for csound"
LICENSE = "MIT"

PV = "6.18.1"

RPM_NAME = "csound-samples-6.18.1-6.4.noarch.rpm"
RPM_HASH = "28371c12a38c084f27422be7ec1ab1e5af29f10eac44d9f50cc36260105d70fdc4a8220e3fdac90afe9beffaf9f1d757fd91c0510456b886b4ea2de173f1689a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "csound-samples"

RDEPENDS:${PN} += ""

inherit rpm
