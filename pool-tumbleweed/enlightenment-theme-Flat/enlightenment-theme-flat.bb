SUMMARY = "Default Enlightenment theme(Flat)"
DESCRIPTION = "The default theme for enlightenment install when using openSUSE branding."
LICENSE = "BSD-2-Clause & LGPL-2.1-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-theme-Flat-0.21.0-37.1.aarch64.rpm"
RPM_HASH = "9ab33a1f7041de046be5eba710cd41e95b8f06058c44453a31be4ebd77d68272d4bc3fbab223fb5f1c132a47f635313ea5805b64a772d0477ffc331950f03887"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-Flat"

RDEPENDS:${PN} += ""

inherit rpm
